package com.aceleradev.backend.mapper;

import com.aceleradev.backend.commons.dto.employee.CreateEmployeeDTO;
import com.aceleradev.backend.entities.Employee;

import java.time.Instant;

public class EmployeeMapper {

    private EmployeeMapper() {}

    public static Employee toEntity(CreateEmployeeDTO dto) {

        Employee employee = new Employee();
        employee.setName(dto.getName());
        employee.setPassword(dto.getPassword());
        employee.setActive(dto.getIsActive());
        employee.setPhoneNumber(dto.getPhoneNumber());
        employee.setEmail(dto.getEmail());
        employee.setIdentifier(dto.getIdentifier());
        employee.setDescription(dto.getDescription());
        employee.setCreatedAt(dto.getCreatedAt());
        employee.setLastLogin(Instant.now());
        employee.setRole(dto.getRole());
        employee.setBaseSalary(dto.getBaseSalary());

        return employee;
    }
}
