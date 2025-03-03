package com.spring_template.demo.service;

import com.spring_template.demo.dto.payment.NewPaymentDto;
import com.spring_template.demo.dto.payment.PaymentDto;
import com.spring_template.demo.entity.Client;
import com.spring_template.demo.entity.Payment;
import com.spring_template.demo.repository.ClientRepository;
import com.spring_template.demo.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final ClientRepository clientRepository;

    public PaymentDto save(NewPaymentDto newPaymentDto) {
        Client client = clientRepository.findById(newPaymentDto.clientId()).orElseThrow();
        Payment payment = new Payment();
        payment.setDescription(newPaymentDto.description());
        payment.setAmount(newPaymentDto.amount());
        payment.setClient(client);
        payment = paymentRepository.save(payment);
        return new PaymentDto(payment.getId(), payment.getDescription(), payment.getAmount(), payment.getClient().getId());
    }

    public PaymentDto findById(Integer id) {
        Payment payment = paymentRepository.findById(id).orElseThrow();
        return new PaymentDto(payment.getId(), payment.getDescription(), payment.getAmount(), payment.getClient().getId());
    }

    public List<PaymentDto> getAll() {
        return paymentRepository.findAll().stream()
                .map(payment -> new PaymentDto(payment.getId(), payment.getDescription(), payment.getAmount(), payment.getClient().getId()))
                .collect(Collectors.toList());
    }

}
