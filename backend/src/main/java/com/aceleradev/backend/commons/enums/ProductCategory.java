package com.aceleradev.backend.commons.enums;

public enum ProductCategory {

    BOOK(1),
    GAMES(2),
    OTHER(3);

    private Integer code;
    ProductCategory(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ProductCategory valueOf(int code){
        for (ProductCategory value : ProductCategory.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid payment code");
    }
}
