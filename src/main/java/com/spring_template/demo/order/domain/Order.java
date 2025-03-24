package com.spring_template.demo.order.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private OrderId id;
    private OrderDescription description;
    private OrderAmount amount;
    private OrderClientId clientId;
    private OrderCreatedAt createdAt;
    private OrderUpdatedAt updatedAt;

    public Integer getId() {
        return id.getValue();
    }

    public void setId(Integer id) {
        this.id = new OrderId(id);
    }

    public String getDescription() {
        return description.getValue();
    }

    public void setDescription(String description) {
        this.description = new OrderDescription(description);
    }

    public Integer getAmount() {
        return amount.getValue();
    }

    public void setAmount(Integer amount) {
        this.amount = new OrderAmount(amount);
    }

    public Integer getClientId() {
        return clientId.getValue();
    }

    public void setClientId(Integer clientId) {
        this.clientId = new OrderClientId(clientId);
    }

    public Date getCreatedAt() {
        return createdAt.getValue();
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = new OrderCreatedAt(createdAt);
    }

    public Date getUpdatedAt() {
        return updatedAt.getValue();
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = new OrderUpdatedAt(updatedAt);
    }
}
