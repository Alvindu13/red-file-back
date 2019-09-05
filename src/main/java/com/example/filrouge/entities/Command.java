package com.example.filrouge.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "commande")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateCommande;

    private Double montantCommande;

    private String modePaiementCommande;

    private String statutPaiementCommande;

    private String modeLivraisonCommande;

    private String statutLivraisonCommande;


}
