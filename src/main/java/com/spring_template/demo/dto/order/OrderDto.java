package com.spring_template.demo.dto.order;

public record OrderDto(Integer id, String description, Integer amount, Integer clientId) {
}
