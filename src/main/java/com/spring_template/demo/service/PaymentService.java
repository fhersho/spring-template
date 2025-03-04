package com.spring_template.demo.service;

import com.spring_template.demo.client.infraestructure.repository.jpa.ClientJPARepository;
import com.spring_template.demo.dto.payment.NewPaymentDto;
import com.spring_template.demo.dto.payment.PaymentDto;
import com.spring_template.demo.payment.infrastructure.repository.jpa.PaymentEntity;
import com.spring_template.demo.payment.infrastructure.repository.jpa.PaymentJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PaymentService {

    private final PaymentJPARepository paymentRepository;
    private final ClientJPARepository clientRepository;

    public PaymentDto save(NewPaymentDto newPaymentDto) {
        Client client = clientRepository.findById(newPaymentDto.clientId()).orElseThrow();
        PaymentEntity payment = new PaymentEntity();
        payment.setDescription(newPaymentDto.description());
        payment.setAmount(newPaymentDto.amount());
        payment.setClient(client);
        payment = paymentRepository.save(payment);
        return new PaymentDto(payment.getId(), payment.getDescription(), payment.getAmount(), payment.getClient().getId());
    }

    public PaymentDto findById(Integer id) {
        PaymentEntity payment = paymentRepository.findById(id).orElseThrow();
        return new PaymentDto(payment.getId(), payment.getDescription(), payment.getAmount(), payment.getClient().getId());
    }

    public List<PaymentDto> getAll() {
        return paymentRepository.findAll().stream()
                .map(payment -> new PaymentDto(payment.getId(), payment.getDescription(), payment.getAmount(), payment.getClient().getId()))
                .collect(Collectors.toList());
    }

}
