package com.aceleradev.backend.entities;

import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.Random;

@Entity
@Table(name = "tb_payment")
public class Payment {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long paymentId;
    @OneToOne
    @JoinColumn(name="order_id")
    private int orderId; // --CLASSE ORDER

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public ZonedDateTime getMoment() {
        return moment;
    }

    public void setMoment(ZonedDateTime moment) {
        this.moment = moment;
    }

    private double amountPaid;
    private ZonedDateTime moment;


}
