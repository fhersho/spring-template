package com.spring_template.demo.dto.payment;

public record NewPaymentDto(String description, Integer amount, Integer clientId) {
}
