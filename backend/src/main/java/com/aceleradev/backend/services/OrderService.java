package com.aceleradev.backend.services;

import com.aceleradev.backend.commons.dto.CreateOrderDTO;
import com.aceleradev.backend.commons.enums.OrderStatus;
import com.aceleradev.backend.entities.Order;
import com.aceleradev.backend.entities.OrderItem;
import com.aceleradev.backend.repositories.OrderItemRepository;
import com.aceleradev.backend.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public Order createOrder(CreateOrderDTO createOrderDTO) {

        Order orderEntity = new Order();
        OrderItem orderItemEntity = new OrderItem();

        orderEntity.setOrderStatus(OrderStatus.valueOf(createOrderDTO.getOrderStatus()));
        orderEntity.setCustomerId(createOrderDTO.getCustomer());
        orderEntity.setEmployeeId(createOrderDTO.getEmployee());

        for(OrderItem dto: createOrderDTO.getItems()){
            orderItemEntity.setOrder(dto.getOrder());
            orderItemEntity.setProduct(dto.getProduct());
            orderItemEntity.setQuantity(dto.getQuantity());
            orderItemEntity.setPrice(dto.getPrice());
        }

        return orderRepository.save(orderEntity);
    }
}
