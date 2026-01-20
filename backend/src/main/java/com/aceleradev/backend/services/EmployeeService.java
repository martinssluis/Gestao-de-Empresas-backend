package com.aceleradev.backend.services;

import com.aceleradev.backend.commons.dto.EmployeeDto;
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

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public EmployeeDto findById(Long id) {
        Optional<Employee> obj = repository.findById(id);
        EmployeeDto dto = new EmployeeDto();

        dto.setDescription(obj.get().getDescription());
        dto.setName(obj.get().getName());
        dto.setEmail(obj.get().getEmail());
        dto.setCreatedAt(obj.get().getCreatedAt());
        dto.setBaseSalary(obj.get().getBaseSalary());
        dto.setId(obj.get().getId());
        dto.setIsActive(obj.get().getActive());
        dto.setPhoneNumber(obj.get().getPhoneNumber());
        dto.setIdentifier(obj.get().getIdentifier());
        dto.setRole(obj.get().getRole());

        return dto;
    }
}
