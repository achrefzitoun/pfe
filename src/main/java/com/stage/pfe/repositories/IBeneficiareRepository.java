package com.stage.pfe.repositories;

import com.stage.pfe.entities.Beneficiare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBeneficiareRepository extends JpaRepository<Beneficiare, Long> {
}
