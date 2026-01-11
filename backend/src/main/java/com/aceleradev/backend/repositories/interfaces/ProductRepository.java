package com.aceleradev.backend.repositories.interfaces;

import com.aceleradev.backend.repositories.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
