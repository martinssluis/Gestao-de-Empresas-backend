package com.aceleradev.backend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_costumer")
public class Costumer extends User {

    public Costumer(){
        super();
    }

    public Costumer(
            Long id,
            String name,
            String password,
            Boolean isActive,
            String phoneNumber,
            String email,
            String identifier,
            String description,
            LocalDate createdAt,
            LocalDate lasLogin
    ){
        super(id, name, password, isActive, phoneNumber, email, identifier, description, createdAt, null);
    }
}
