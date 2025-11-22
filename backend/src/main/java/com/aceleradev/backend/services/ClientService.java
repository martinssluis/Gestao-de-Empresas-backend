package com.aceleradev.backend.services;

import com.aceleradev.backend.entities.Client;
import com.aceleradev.backend.repositories.ClientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> findAll(){
        return repository.findAll();
    }

    public Client findById(Long id){
        Client obj = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Client not found")); // Verificação para evitar o uso do .get() no retorno
        return obj;
    }
}
