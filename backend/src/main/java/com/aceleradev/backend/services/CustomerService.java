package com.aceleradev.backend.services;

import com.aceleradev.backend.repositories.entities.Customer;
import com.aceleradev.backend.repositories.interfaces.CostumerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CostumerRepository repository;

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Costumer not found"));
    }
}
