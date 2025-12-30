package com.aceleradev.backend.repositories;

import com.aceleradev.backend.entities.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<Costumer,Long> {
}
