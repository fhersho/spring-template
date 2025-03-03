package com.spring_template.demo.dto.payment;

public record PaymentDto(Integer id, String description, Integer amount, Integer clientId) {
}
