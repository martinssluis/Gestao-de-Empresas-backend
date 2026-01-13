package com.aceleradev.backend.entities;

import com.aceleradev.backend.commons.enums.ProductCategory;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private int category;

    public Product() {
    }

    public Product(Long id, String name, Double price, ProductCategory category) {
        this.id = id;
        setName(name);
        setPrice(price);
        setCategory(category);
    }
    public ProductCategory getRole() {

        return ProductCategory.valueOf(category);
    }

    public void setCategory(ProductCategory category) {
        if (category != null){
            this.category = category.getCode();
        }

    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getCategory() {
        return category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
