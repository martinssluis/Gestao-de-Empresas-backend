package com.aceleradev.backend.entities;

import jakarta.persistence.*;

import java.util.Date;
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
    private String pawssord;
    private String position;
    private Double baseSallary;
    private String discription;
    private Date hiredIn;
    private Date firedIn;

    public Employee(){}

    public Employee(Long id, String name, String phone, String email, String pawssord, String position, Double baseSallary, String discription, Date hiredIn, Date firedIn) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.pawssord = pawssord;
        this.position = position;
        this.baseSallary = baseSallary;
        this.discription = discription;
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

    public String getPawssord() {
        return pawssord;
    }

    public void setPawssord(String pawssord) {
        this.pawssord = pawssord;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getBaseSallary() {
        return baseSallary;
    }

    public void setBaseSallary(Double baseSallary) {
        this.baseSallary = baseSallary;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Date getHiredIn() {
        return hiredIn;
    }

    public void setHiredIn(Date hiredIn) {
        this.hiredIn = hiredIn;
    }

    public Date getFiredIn() {
        return firedIn;
    }

    public void setFiredIn(Date firedIn) {
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
