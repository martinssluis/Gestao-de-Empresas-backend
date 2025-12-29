package com.aceleradev.backend.resources;

import com.aceleradev.backend.entities.Costumer;
import com.aceleradev.backend.services.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/costumer")
public class CostumerResource {

    @Autowired
    private CostumerService service;

    @GetMapping
    public ResponseEntity<List<Costumer>> findAll(){ // Considerar usar o Page<>()
        List<Costumer> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}") // Não precisa usar o value
    public ResponseEntity<Costumer> findById(@PathVariable Long id){
        Costumer obj = service.findById(id);
        return ResponseEntity.ok().body(obj); // Considerar usar os DTOs para retorno e parâmetro
    }
}
