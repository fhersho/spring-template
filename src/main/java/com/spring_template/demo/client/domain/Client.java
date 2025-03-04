package com.spring_template.demo.client.domain;

import lombok.Data;

@Data
public class Client {
    private ClientIdVO id;
    private ClientNameVO name;
    private ClientDescriptionVO description;
    private ClientDebtVO debt;
    private ClientCreatedAtVO createdAt;
    private ClientUpdatedAtVO updatedAt;
}
