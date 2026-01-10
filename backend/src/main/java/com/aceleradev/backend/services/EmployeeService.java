package com.aceleradev.backend.services;

import com.aceleradev.backend.repositories.entities.Employee;
import com.aceleradev.backend.repositories.interfaces.EmployeeRepository;
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
    }
}
