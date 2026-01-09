package com.aceleradev.backend.controller;

import com.aceleradev.backend.entities.Customer;
import com.aceleradev.backend.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/costumer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public ResponseEntity<List<Customer>> findAll(){ // Considerar usar o Page<>()
        List<Customer> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}") // Não precisa usar o value
    public ResponseEntity<Customer> findById(@PathVariable Long id){
        Customer obj = service.findById(id);
        return ResponseEntity.ok().body(obj); // Considerar usar os DTOs para retorno e parâmetro
    }
}
