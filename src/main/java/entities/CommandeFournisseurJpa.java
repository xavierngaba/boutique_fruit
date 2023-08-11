package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "COMMANDE_FOURNISSEUR")
public class CommandeFournisseurJpa {

    @Id
    @GeneratedValue
    private Long id;

    private Status status;

    @OneToMany
    private FruitJpa fruit;

    private Integer quantite;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
}
