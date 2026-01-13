package com.aceleradev.backend.commons.enums;

public enum PaymentStatus {

    COMPLETED(1),
    CANCELED(2),
    PENDING(3);

    private int code;

    private PaymentStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PaymentStatus valueOf(int code) {
        for (PaymentStatus value : PaymentStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid PaymentStatus code.");
    }

}
