package acc.br.summerAcademy.controller;

import acc.br.summerAcademy.model.Product;
import acc.br.summerAcademy.services.ProdutoServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Products")
public class StockController {

    private final ProdutoServices produtoServices;
    public StockController(ProdutoServices produtoServices) {
        this.produtoServices = produtoServices;
    }

    @PostMapping
    public ResponseEntity<Product> createProduto(@RequestBody Product product) {
        return ResponseEntity.ok(produtoServices.createproduto(product));
    }
    @GetMapping
    public ResponseEntity<List<Product>> getAllProdutos() {
        return ResponseEntity.ok(produtoServices.findAllProdutos());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduto(@PathVariable Long id, @RequestBody Product product) {
        return ResponseEntity.ok(produtoServices.updateProduto(id, product));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduto(@PathVariable Long id) {
        produtoServices.deleteProduto(id);
        return ResponseEntity.noContent().build();
    }

}
