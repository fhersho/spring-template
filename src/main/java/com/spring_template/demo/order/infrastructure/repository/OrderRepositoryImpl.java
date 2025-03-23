package com.spring_template.demo.order.infrastructure.repository;

import com.spring_template.demo.order.domain.Order;
import com.spring_template.demo.order.domain.OrderRepository;
import com.spring_template.demo.order.infrastructure.repository.jpa.OrderJPARepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderJPARepository repository;

    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Optional<Order> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public void delete(Order entity) {

    }
}
