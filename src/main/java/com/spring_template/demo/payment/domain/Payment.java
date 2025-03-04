package com.spring_template.demo.payment.domain;

import lombok.Data;

@Data
public class Payment {
    private PaymentIdVO id;
    private PaymentDescriptionVO description;
    private PaymentAmountVO amount;
    private PaymentClientIdVO clientId;
    private PaymentCreatedAtVO createdAt;
    private PaymentUpdatedAtVO updatedAt;
}
