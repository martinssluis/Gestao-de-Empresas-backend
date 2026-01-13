package com.aceleradev.backend.services;

import com.aceleradev.backend.entities.Employee;
import com.aceleradev.backend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> findAll(){
        return repository.findAll();
    }

    public Employee findById(Long id){
        Optional<Employee> obj = repository.findById(id);
        return obj.get();

        // padronizar igual a ClientService? se o ID não existir = 500 Internal Server Error
        // public Employee findById(Long id){
        //    return repository.findById(id)
        //        .orElseThrow(() -> new EntityNotFoundException("Employee not found"));
        //}
    }
}
