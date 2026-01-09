package com.aceleradev.backend.repositories;

import com.aceleradev.backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<Customer,Long> {
}
