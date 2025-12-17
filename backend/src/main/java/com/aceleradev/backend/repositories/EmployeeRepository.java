package com.aceleradev.backend.repositories;

import com.aceleradev.backend.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByEmail(String email);
}
