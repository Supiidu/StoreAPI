package acc.br.summerAcademy.service;

import acc.br.summerAcademy.domain.model.Order;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void simulatePayment(Order order) {
        try {
            System.out.println("Processando pagamento para o pedido ID: " + order.getOrder_ID());
            Thread.sleep(4000);
            System.out.println("Pagamento concluído para o pedido ID: " + order.getOrder_ID());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Erro ao simular pagamento para o pedido ID: " + order.getOrder_ID());
        }
    }
}
