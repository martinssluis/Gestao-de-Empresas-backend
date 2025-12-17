package com.aceleradev.backend.repositories;

import com.aceleradev.backend.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findByEmail(String email);
}
