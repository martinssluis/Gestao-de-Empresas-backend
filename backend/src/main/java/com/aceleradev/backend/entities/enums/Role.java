package com.aceleradev.backend.entities.enums;

public enum Role {
    VENDEDOR(1),
    GERENTE(2),
    ESTAGIARIO(3);

    private int code;

    private Role(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Role valueOf(int code){
        for (Role value : Role.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Role code");
    }
}