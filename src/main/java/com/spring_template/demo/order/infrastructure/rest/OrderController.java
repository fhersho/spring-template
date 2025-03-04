package com.spring_template.demo.order.infrastructure.rest;

import com.spring_template.demo.dto.order.NewOrderDto;
import com.spring_template.demo.dto.order.OrderDto;
import com.spring_template.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping()
    public ResponseEntity<List<OrderDto>> getAll() {
        return ResponseEntity.ok(orderService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(orderService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<OrderDto> save(@RequestBody NewOrderDto orderDto) {
        return ResponseEntity.ok(orderService.save(orderDto));
    }
}
