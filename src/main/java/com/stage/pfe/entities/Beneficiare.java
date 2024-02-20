package com.stage.pfe.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Beneficiare implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String numBeneficiare;

    String nom,prenom;

    LocalDate dateNaissance;

    String noSS,cleSS;

    String regimeSociale;

    TypeBeneficiare typeBeneficiare;

    LocalDate dateDeniereModification;

    String raisonSociale,situation,frontalier;

    Boolean femme;

    String nomJeuneFille;

    @ManyToOne
    Devis devis;


}
