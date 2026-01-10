package com.aceleradev.backend.commons.dto;

import com.aceleradev.backend.repositories.entities.Customer;

import java.time.LocalDate;

public class CustomerDto {
    public String name;
    public String password;
    public Boolean isActive;
    public String phoneNumber;
    public String email;
    public String description;
    public LocalDate createdAt;
    public LocalDate lastLogin;
    public String identifier;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }


    public Customer toEntity(){
        Customer customerToEntity = new Customer();
        customerToEntity.setName(this.name);
        customerToEntity.setPassword(this.password);
        customerToEntity.setPhoneNumber(this.phoneNumber);
        customerToEntity.setEmail(this.email);
        customerToEntity.setDescription(this.description);
        customerToEntity.setCreatedAt(this.createdAt);
        customerToEntity.setIdentifier(this.identifier);
        return customerToEntity;
    }
}
