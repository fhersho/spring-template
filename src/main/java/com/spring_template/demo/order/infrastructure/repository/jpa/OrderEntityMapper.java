package com.spring_template.demo.order.infrastructure.repository.jpa;

import com.spring_template.demo.order.domain.Order;

public class OrderEntityMapper {
    public static OrderEntity toEntity(Order order) {
        if (order == null) {
            return null;
        }
        OrderEntity entity = new OrderEntity();
        entity.setId(order.getId());
        entity.setDescription(order.getDescription());
        entity.setAmount(order.getAmount());
        entity.setClientId(order.getClientId());
        return entity;
    }

    public static Order toDomain(OrderEntity entity) {
        if (entity == null) {
            return null;
        }
        Order order = new Order();
        order.setId(entity.getId());
        order.setDescription(entity.getDescription());
        order.setAmount(entity.getAmount());
        order.setClientId(entity.getClientId());
        return order;
    }
}
