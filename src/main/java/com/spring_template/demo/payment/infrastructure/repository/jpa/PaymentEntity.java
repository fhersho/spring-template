package com.spring_template.demo.payment.infrastructure.repository.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "payments")
public class PaymentEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    private String description;
    private Integer amount;

    @Column(name = "client_id")
    private Integer clientId;
}
