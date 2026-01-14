package com.aceleradev.backend.entities;

import com.aceleradev.backend.commons.enums.OrderStatus;
import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private ZonedDateTime moment;
    private Integer orderStatus;
    @ManyToOne
    @JoinColumn(name="customerId")
    private Customer customer;
    @OneToOne
    @JoinColumn(name="id")
    private Employee employee;

    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();

    @OneToOne(mappedBy = "orderId", cascade = CascadeType.ALL) // mapeando as entidades para terem o mesmo id
    private Payment payment;

    public Order(){}

    public Order(Long id, ZonedDateTime moment, OrderStatus orderStatus, Customer customer, Employee employee){
        this.orderId = orderId;
        this.moment = moment;
        this.setOrderStatus(orderStatus);
        this.customer = customer;
        this.employee = employee;
    }

    public Employee getEmployeeId() {
        return employee;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employee = employeeId;
    }

    public Customer getCustomerId() {
        return customer;
    }

    public void setCustomerId(Customer customerId) {
        this.customer = customerId;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null) {
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Set<OrderItem> getItems() {
        return items;
    }

    public Double getTotal(){
        double sum = 0.0;
        for (OrderItem x : items){
            sum += x.getSubtotal();
        }
        return sum;
    }


}