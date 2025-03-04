package com.spring_template.demo.order.domain;

import lombok.Data;

@Data
public class Order {
    private OrderIdVO id;
    private OrderDescriptionVO description;
    private OrderAmountVO amount;
    private OrderClientIdVO clientId;
    private OrderCreatedAtVO createdAt;
    private OrderUpdatedAtVO updatedAt;
}
