package acc.br.summerAcademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import acc.br.summerAcademy.model.Product;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByProductName(String productName);
}
