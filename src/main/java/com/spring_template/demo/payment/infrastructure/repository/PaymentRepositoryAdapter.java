package com.spring_template.demo.payment.infrastructure.repository;

import com.spring_template.demo.payment.domain.Payment;
import com.spring_template.demo.payment.domain.PaymentRepository;
import com.spring_template.demo.payment.infrastructure.repository.jpa.PaymentJPARepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PaymentRepositoryAdapter implements PaymentRepository {
    private final PaymentJPARepository repository;

    @Override
    public Payment save(Payment payment) {
        return null;
    }

    @Override
    public Optional<Payment> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Payment> findAll() {
        return null;
    }

    @Override
    public void delete(Payment entity) {

    }
}
