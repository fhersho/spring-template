package com.spring_template.demo.order.domain;

import lombok.Data;

@Data
public class Order {
    private OrderId id;
    private OrderDescription description;
    private OrderAmount amount;
    private OrderClientId clientId;
    private OrderCreatedAt createdAt;
    private OrderUpdatedAt updatedAt;
}
