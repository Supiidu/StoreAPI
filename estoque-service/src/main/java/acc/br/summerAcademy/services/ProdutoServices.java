package acc.br.summerAcademy.services;


import acc.br.summerAcademy.model.Product;
import acc.br.summerAcademy.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServices {

    private final ProductRepository productRepository;
    public ProdutoServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createproduto(Product product){

        return productRepository.save(product);
    }
    public List<Product> findAllProdutos(){
        return productRepository.findAll();
    }

    public Product findProdutoById(Long id){
        Optional<Product> produto = productRepository.findById(id);
        return produto.get();
    }
    public Product updateProduto(Long id, Product product){
        product.setProduct_id(id);
        return productRepository.save(product);
    }
    public void deleteProduto(Long id){
        productRepository.deleteById(id);
    }
}
