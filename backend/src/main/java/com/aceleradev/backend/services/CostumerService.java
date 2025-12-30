package com.aceleradev.backend.services;

import com.aceleradev.backend.entities.Costumer;
import com.aceleradev.backend.repositories.CostumerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumerService {

    @Autowired
    private CostumerRepository repository;

    public List<Costumer> findAll(){
        return repository.findAll();
    }

    public Costumer findById(Long id){
        Costumer obj = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Costumer not found")); // Verificação para evitar o uso do .get() no retorno
        return obj;
    }
}
