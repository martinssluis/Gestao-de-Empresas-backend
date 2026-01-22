package com.aceleradev.backend.services;

import com.aceleradev.backend.commons.dto.employee.CreateEmployeeDTO;
import com.aceleradev.backend.entities.Employee;
import com.aceleradev.backend.mapper.EmployeeMapper;
import com.aceleradev.backend.repositories.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> findAll(){
        return repository.findAll();
    }

    public Employee findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found."));
    }

    public Employee create(CreateEmployeeDTO dto) {
        Employee employee = EmployeeMapper.toEntity(dto);
        return repository.save(employee);
    }

        // padronizar igual a ClientService? se o ID não existir = 500 Internal Server Error
        // public Employee findById(Long id){
        //    return repository.findById(id)
        //        .orElseThrow(() -> new EntityNotFoundException("Employee not found"));
        //}
    // feito

}
