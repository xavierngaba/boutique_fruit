package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "FRUIT")
public class FruitJpa implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nomFruit;

    private String provenance;

    private Double prix;

    private Integer quantite;

    private String Fournisseur;

}
