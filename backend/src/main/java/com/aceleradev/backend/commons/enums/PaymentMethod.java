package com.aceleradev.backend.commons.enums;

public enum PaymentMethod {
    PIX(1),
    CREDIT(2),
    DEBIT(3);
    private int code;
    PaymentMethod(int code) {
         this.code = code;
    }


    public int getCode() {
        return code;
    }

    public static PaymentMethod valueOf(int code){
        for (PaymentMethod value : PaymentMethod.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid payment code");
    }
}