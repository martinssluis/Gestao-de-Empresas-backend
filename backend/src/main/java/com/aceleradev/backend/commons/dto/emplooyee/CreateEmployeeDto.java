package com.aceleradev.backend.commons.dto.emplooyee;

import com.aceleradev.backend.commons.enums.Role;

import java.time.LocalDate;

public class CreateEmployeeDto {

    private String name;
    private String password;
    private Boolean isActive;
    private String phoneNumber;
    private String email;
    private String description;
    private LocalDate lastLogin;
    private Double baseSalary;
    private Role roole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Role getRoole() {
        return roole;
    }

    public void setRoole(Role roole) {
        this.roole = roole;
    }
}
