package com.aceleradev.backend.entities;

import com.aceleradev.backend.commons.enums.Role;
import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "tb_employee")
public class Employee extends User {

    @Column(nullable = false)
    private Integer role;
    @Column(nullable = false)
    private Double baseSalary;


    public Employee(){
        super();
    }


    public Role getRole() {

        return Role.valueOf(role);
    }

    public void setRole(Role role) {
        if (role == null){
            throw new IllegalArgumentException("Role cannot be null");
        }
        this.role = role.getCode();
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        if (role == null){
            throw new IllegalArgumentException("Base Salary cannot be null");
        }
        this.baseSalary = baseSalary;
    }

}
