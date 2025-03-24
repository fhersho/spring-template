package com.spring_template.demo.order.infrastructure.repository;

import com.spring_template.demo.order.domain.Order;
import com.spring_template.demo.order.domain.OrderRepository;
import com.spring_template.demo.order.infrastructure.repository.jpa.OrderEntity;
import com.spring_template.demo.order.infrastructure.repository.jpa.OrderEntityMapper;
import com.spring_template.demo.order.infrastructure.repository.jpa.OrderJPARepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class OrderRepositoryAdapter implements OrderRepository {

    private final OrderJPARepository repository;

    @Override
    public Order save(Order order) {
        OrderEntity orderEntity = OrderEntityMapper.toEntity(order);
        orderEntity = repository.save(orderEntity);
        return OrderEntityMapper.toDomain(orderEntity);
    }

    @Override
    public Optional<Order> findById(Integer id) {
        OrderEntity orderEntity = repository.findById(id).orElse(null);
        return Optional.ofNullable(OrderEntityMapper.toDomain(orderEntity));
    }

    @Override
    public List<Order> findAll() {
        List<OrderEntity> orderEntities = repository.findAll();
        return orderEntities.stream()
                .map(OrderEntityMapper::toDomain)
                .toList();
    }

    @Override
    public void delete(Order entity) {
        OrderEntity orderEntity = OrderEntityMapper.toEntity(entity);
        repository.delete(orderEntity);
    }
}
