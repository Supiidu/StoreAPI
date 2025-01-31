package acc.br.summerAcademy.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "SummerAcadedmy_Store")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Loja_id;

    @Column(nullable = false)
    private String Loja_Estado;

    public Long getLoja_id() {
        return Loja_id;
    }

    public void setLoja_id(Long id) {
        this.Loja_id = id;
    }

    public String getLoja_Estado() {
        return Loja_Estado;
    }

    public void setLoja_Estado(String loja_Estado) {
        Loja_Estado = loja_Estado;
    }
}
