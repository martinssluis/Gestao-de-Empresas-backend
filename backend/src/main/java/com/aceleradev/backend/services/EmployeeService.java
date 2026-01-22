package com.aceleradev.backend.services;

import com.aceleradev.backend.commons.dto.employee.CreateEmployeeDTO;
import com.aceleradev.backend.commons.dto.employee.EmployeeResponseDTO;
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

    public List<EmployeeResponseDTO> findAll(){
        return repository.findAll()
                .stream()
                .map(EmployeeMapper::toResponse)
                .toList();
    }

    public EmployeeResponseDTO findById(Long id) {
        Employee employee = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found."));

        return EmployeeMapper.toResponse(employee);
    }

    public Employee create(CreateEmployeeDTO dto) {
        Employee employee = EmployeeMapper.toEntity(dto);
        return repository.save(employee);
    }
}
