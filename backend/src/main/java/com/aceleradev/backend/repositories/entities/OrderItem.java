package com.aceleradev.backend.repositories.entities;


import jakarta.persistence.*;

@Table(name="double_primary_key")
public class OrderItem {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
