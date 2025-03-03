package com.spring_template.demo.controller;

import com.spring_template.demo.dto.payment.NewPaymentDto;
import com.spring_template.demo.dto.payment.PaymentDto;
import com.spring_template.demo.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Payments")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService PaymentService;

    @GetMapping()
    public ResponseEntity<List<PaymentDto>> getAll() {
        return ResponseEntity.ok(PaymentService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentDto> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(PaymentService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<PaymentDto> save(@RequestBody NewPaymentDto PaymentDto) {
        return ResponseEntity.ok(PaymentService.save(PaymentDto));
    }
}
