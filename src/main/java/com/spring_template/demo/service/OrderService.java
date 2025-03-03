package com.spring_template.demo.service;

import com.spring_template.demo.dto.order.NewOrderDto;
import com.spring_template.demo.dto.order.OrderDto;
import com.spring_template.demo.entity.Client;
import com.spring_template.demo.entity.Order;
import com.spring_template.demo.repository.ClientRepository;
import com.spring_template.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ClientRepository clientRepository;

    public OrderDto save(NewOrderDto newOrderDto) {
        Client client = clientRepository.findById(newOrderDto.clientId()).orElseThrow();
        Order order = new Order();
        order.setDescription(newOrderDto.description());
        order.setAmount(newOrderDto.amount());
        order.setClient(client);

        order = orderRepository.save(order);

        return new OrderDto(order.getId(), order.getDescription(), order.getAmount(), order.getClient().getId());
    }

    public OrderDto findById(Integer id) {
        Order order = orderRepository.findById(id).orElseThrow();
        return new OrderDto(order.getId(), order.getDescription(), order.getAmount(), order.getClient().getId());
    }

    public List<OrderDto> getAll() {
        return orderRepository.findAll().stream()
                .map(order -> new OrderDto(order.getId(), order.getDescription(), order.getAmount(), order.getClient().getId()))
                .collect(Collectors.toList());
    }

}
