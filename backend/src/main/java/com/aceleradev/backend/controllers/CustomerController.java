package com.aceleradev.backend.controllers;

import com.aceleradev.backend.commons.dto.CreateCustomerDto;
import com.aceleradev.backend.commons.dto.GetCustomerDto;
import com.aceleradev.backend.commons.dto.UpdateCustomerDto;
import com.aceleradev.backend.entities.Customer;
import com.aceleradev.backend.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody CreateCustomerDto customerDto) {
        Customer customer = service.createCustomer(customerDto);
        return ResponseEntity.status(201).body(customer);
    }

    @GetMapping
    public ResponseEntity<List<GetCustomerDto>> findAll(){
        List<GetCustomerDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetCustomerDto> findById(@PathVariable Long id){
        GetCustomerDto obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody UpdateCustomerDto updateCustomerDto) {
        Customer updatedCustomer = service.updateCustomer(id, updateCustomerDto);
        return ResponseEntity.ok(updatedCustomer);
    }

}
