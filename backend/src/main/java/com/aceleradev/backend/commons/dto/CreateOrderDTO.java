package com.aceleradev.backend.commons.dto;

import com.aceleradev.backend.entities.Customer;
import com.aceleradev.backend.entities.Employee;
import com.aceleradev.backend.entities.OrderItem;

import java.util.HashSet;
import java.util.Set;

public class CreateOrderDTO {

    private Integer orderStatus;
    private Customer customer;
    private Employee employee;
    private Set<OrderItem> items = new HashSet<>();

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Set<OrderItem> getItems() {
        return items;
    }

    public void setItems(Set<OrderItem> items) {
        this.items = items;
    }

}
