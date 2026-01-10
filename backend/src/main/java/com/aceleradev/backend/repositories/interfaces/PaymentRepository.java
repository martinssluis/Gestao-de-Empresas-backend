package com.aceleradev.backend.repositories.interfaces;

import com.aceleradev.backend.repositories.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
