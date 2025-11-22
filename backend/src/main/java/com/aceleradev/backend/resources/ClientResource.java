package com.aceleradev.backend.resources;

import com.aceleradev.backend.entities.Client;
import com.aceleradev.backend.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){ // Considerar usar o Page<>()
        List<Client> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}") // Não precisa usar o value
    public ResponseEntity<Client> findById(@PathVariable Long id){
        Client obj = service.findById(id);
        return ResponseEntity.ok().body(obj); // Considerar usar os DTOs para retorno e parâmetro
    }
}
