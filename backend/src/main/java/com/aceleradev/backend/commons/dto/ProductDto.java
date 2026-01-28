package com.aceleradev.backend.commons.dto;

import com.aceleradev.backend.commons.enums.ProductCategory;

public class ProductDto {

    private String name;
    private Double price;
    private ProductCategory category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

}
