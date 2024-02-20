package com.stage.pfe.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Devis implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String numDevis;

    Double valDevis;

    LocalDate dateDevis;

    LocalDate dateDerniereModification;

    Boolean surComp;

    LocalDate adhesionDate;

    @OneToMany(mappedBy = "devis")
    Set<Beneficiare> beneficiares;

    @ManyToMany
    Set<RisqueLevel> risqueLevel;

    @OneToOne
    Formule formule;

    @ManyToOne
    Souscripteur souscripteur;

    @OneToOne
    Signature signature;


}
