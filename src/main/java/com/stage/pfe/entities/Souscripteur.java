package com.stage.pfe.entities;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Souscripteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idSouscripteur;
    String numSouscripteur;
    LocalDate dateDerniereModification;
    String email;
    LocalDate dateNaissance;
    LocalDate dateAdhesion;
    @Enumerated(EnumType.STRING)
    Regime regime;
    Boolean CSS ;
    Boolean PPE ;

    @OneToOne(mappedBy = "souscripteur")
    Contrat contrat;

    @OneToMany(mappedBy = "souscripteur")
    List<Devis> devis;








}
