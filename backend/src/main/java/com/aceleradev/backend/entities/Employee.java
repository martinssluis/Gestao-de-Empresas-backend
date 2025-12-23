package com.aceleradev.backend.entities;

import com.aceleradev.backend.entities.enums.Role;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_employee")
public class Employee {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String password;
    private Integer position;
    private Double baseSalary;
    private String description;
    private LocalDate hiredIn;
    private LocalDate firedIn;

    public Employee(){}

    public Employee(Long id, String name, String phone, String email, String password, Role role, Double baseSalary, String description, LocalDate hiredIn, LocalDate firedIn) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        setPosition(role);
        this.baseSalary = baseSalary;
        this.description = description;
        this.hiredIn = hiredIn;
        this.firedIn = firedIn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getPosition() {

        return Role.valueOf(position);
    }

    public void setPosition(Role role) {
        if (role != null){
        this.position = role.getCode();
        }

    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getHiredIn() {
        return hiredIn;
    }

    public void setHiredIn(LocalDate hiredIn) {
        this.hiredIn = hiredIn;
    }

    public LocalDate getFiredIn() {
        return firedIn;
    }

    public void setFiredIn(LocalDate firedIn) {
        this.firedIn = firedIn;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
