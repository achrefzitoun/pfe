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
public class Signature implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idSignature;
    String numSignature;
    Boolean isSigned;
    LocalDate dateSignature;
    LocalDate dateDerniereModification;

    @OneToOne
    Document contrat;
    
    @OneToOne(mappedBy = "signature")
    Devis devis;



}
