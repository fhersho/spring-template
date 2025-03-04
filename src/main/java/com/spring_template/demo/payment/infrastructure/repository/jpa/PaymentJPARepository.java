package com.spring_template.demo.payment.infrastructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentJPARepository extends JpaRepository<PaymentEntity, Integer> {
}
