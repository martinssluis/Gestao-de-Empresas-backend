package com.aceleradev.backend.mapper;

import com.aceleradev.backend.commons.dto.employee.CreateEmployeeDTO;
import com.aceleradev.backend.commons.dto.employee.EmployeeResponseDTO;
import com.aceleradev.backend.entities.Employee;

import java.time.Instant;

public class EmployeeMapper {

    private EmployeeMapper() {}

    public static EmployeeResponseDTO toResponse(Employee employee) {

        EmployeeResponseDTO dto = new EmployeeResponseDTO();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setEmail(employee.getEmail());
        //dto.setPassword(dto.getPassword());
        dto.setIsActive(employee.getIsActive());
        dto.setPhoneNumber(employee.getPhoneNumber());
        //dto.setIdentifier(dto.getIdentifier());
        dto.setDescription(employee.getDescription());
        dto.setCreatedAt(employee.getCreatedAt());
        dto.setLastLogin(employee.getLastLogin());
        dto.setRole(employee.getRole());
        dto.setBaseSalary(employee.getBaseSalary());

        return dto;
    }

    public static Employee toEntity(CreateEmployeeDTO dto) {
        Employee employee = new Employee();
        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setPassword(dto.getPassword());
        employee.setIsActive(dto.getIsActive());
        employee.setPhoneNumber(dto.getPhoneNumber());
        employee.setIdentifier(dto.getIdentifier());
        employee.setDescription(dto.getDescription());
        employee.setCreatedAt(dto.getCreatedAt());
        employee.setRole(dto.getRole());
        employee.setBaseSalary(dto.getBaseSalary());

        return employee;
    }

}
