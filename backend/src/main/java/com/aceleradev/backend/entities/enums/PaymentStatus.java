package com.aceleradev.backend.entities.enums;

public enum PaymentStatus {

    CONCLUIDO(1),
    CANCELADO(2),
    PENDENTE(3);

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
