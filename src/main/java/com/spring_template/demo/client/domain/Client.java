package com.spring_template.demo.client.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Client {
    private ClientId id;
    private ClientName name;
    private ClientDescription description;
    private ClientDebt debt;
    private ClientCreatedAt createdAt;
    private ClientUpdatedAt updatedAt;

    public Integer getId() {
        if (id == null) {
            return null;
        }
        return id.getValue();
    }

    public void setId(Integer id) {
        this.id = new ClientId(id);
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name = new ClientName(name);
    }

    public String getDescription() {
        return description.getValue();
    }

    public void setDescription(String description) {
        this.description = new ClientDescription(description);
    }

    public Integer getDebt() {
        if (debt == null) {
            return 0;
        }
        return debt.getValue();
    }

    public void setDebt(Integer debt) {
        this.debt = new ClientDebt(debt);
    }

    public Date getCreatedAt() {
        if (createdAt == null) {
            return null;
        }
        return createdAt.getValue();
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = new ClientCreatedAt(createdAt);
    }

    public Date getUpdatedAt() {
        if (updatedAt == null) {
            return null;
        }
        return updatedAt.getValue();
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = new ClientUpdatedAt(updatedAt);
    }
}
