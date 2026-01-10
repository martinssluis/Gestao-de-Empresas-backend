package com.aceleradev.backend.entities;

import com.aceleradev.backend.entities.enums.OrderStatus;
import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private ZonedDateTime moment;
    private Integer orderStatus;
    @OneToOne
    @JoinColumn(name="customerId")
    private Customer customerId;
    @OneToOne
    @JoinColumn(name="id")
    private Employee employeeId;

    public Order(){}

    public Order(int orderId, ZonedDateTime moment,OrderStatus orderStatus, Customer customerId, Employee employeeId) {
        this.orderId = orderId;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.customerId = customerId;
        this.employeeId = employeeId;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if(orderStatus != null){
         this.orderStatus = orderStatus.getCode();
        }
    }

    public ZonedDateTime getMoment() {
        return moment;
    }

    public void setMoment(ZonedDateTime moment) {
        this.moment = moment;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

}