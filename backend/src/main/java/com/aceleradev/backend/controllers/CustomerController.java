package com.aceleradev.backend.controllers;

import com.aceleradev.backend.commons.dto.CreateCustomerDto;
import com.aceleradev.backend.commons.dto.GetCustomerDto;
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
    public void saveCustomer(@RequestBody CreateCustomerDto customerDto) {
        service.createCustomer(customerDto);
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
}
