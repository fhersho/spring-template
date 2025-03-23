package com.spring_template.demo.payment.domain;

import lombok.Data;

@Data
public class Payment {
    private PaymentId id;
    private PaymentDescription description;
    private PaymentAmount amount;
    private PaymentClientId clientId;
    private PaymentCreatedAt createdAt;
    private PaymentUpdatedAt updatedAt;
}
