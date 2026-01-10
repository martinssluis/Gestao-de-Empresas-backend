package com.aceleradev.backend.controller;

import com.aceleradev.backend.commons.dto.CustomerDto;
import com.aceleradev.backend.repositories.entities.Customer;
import com.aceleradev.backend.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/costumer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public void saveCustomer(@RequestBody CustomerDto customerDto) {
        service.createCustomer();
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAll(){
        List<Customer> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id){
        Customer obj = service.findById(id);
        return ResponseEntity.ok().body(obj); // Considerar usar os DTOs para retorno e parâmetro
    }
}
