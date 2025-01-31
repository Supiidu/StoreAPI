package acc.br.summerAcademy.consumer;

import acc.br.summerAcademy.model.Product;
import acc.br.summerAcademy.repository.ProductRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import acc.br.summerAcademy.domain.model.Order;

import java.util.Optional;

@Component
public class StockConsumer {

    private final RabbitTemplate rabbitTemplate;
    private final ProductRepository productRepository;

    public StockConsumer(RabbitTemplate rabbitTemplate, ProductRepository productRepository) {
        this.rabbitTemplate = rabbitTemplate;
        this.productRepository = productRepository;
    }

    @RabbitListener(queues = "orders.v1.order-created")

    public void processOrder(Order order) {
        // Busca o produto pelo nome
        Optional<Product> produtoOptional = productRepository.findByProductName(order.getProductName());
        if (produtoOptional.isPresent()) {
            Product product = produtoOptional.get();
            if (product.getStock() < order.getQuantity()) {
                System.out.println("Estoque Insuficiente");
            } else {
                product.setStock(product.getStock() - order.getQuantity());
                productRepository.save(product);
            }
        } else {
            System.out.println("Produto não encontrado: ");
        }

        rabbitTemplate.convertAndSend(
                "order.exchange", // Exchange existente
                "order.status.updated",          // Routing key para status atualizado
                order
        );
    }
}
