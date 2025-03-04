package com.spring_template.demo.order.infrastructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJPARepository extends JpaRepository<OrderEntity, Integer> {
}
