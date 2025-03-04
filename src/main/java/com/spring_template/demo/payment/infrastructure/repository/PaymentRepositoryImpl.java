package com.spring_template.demo.payment.infrastructure.repository;

import com.spring_template.demo.payment.domain.Payment;
import com.spring_template.demo.payment.domain.PaymentRepository;
import com.spring_template.demo.payment.infrastructure.repository.jpa.PaymentEntity;
import com.spring_template.demo.payment.infrastructure.repository.jpa.PaymentJPARepository;
import com.spring_template.demo.shared.domain.IdentifierVO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class PaymentRepositoryImpl implements PaymentRepository {
    private final PaymentJPARepository repository;
    private final ModelMapper modelMapper;

    @Override
    public Payment save(Payment payment) {
        PaymentEntity paymentEntity = modelMapper.map(payment, PaymentEntity.class);
        paymentEntity = repository.save(paymentEntity);
        return modelMapper.map(paymentEntity, Payment.class);
    }

    @Override
    public Optional<Payment> findById(IdentifierVO id) {
        PaymentEntity paymentEntity = repository.findById(id.getValue()).orElse(null);
        return Optional.ofNullable(modelMapper.map(paymentEntity, Payment.class));
    }

    @Override
    public List<Payment> findAll() {
        return repository.findAll().stream().map(entity -> modelMapper.map(entity, Payment.class))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Payment entity) {
        PaymentEntity paymentEntity = modelMapper.map(entity, PaymentEntity.class);
        repository.delete(paymentEntity);
    }
}
