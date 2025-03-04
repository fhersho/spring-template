package com.spring_template.demo.order.infrastructure.repository;

import com.spring_template.demo.order.domain.Order;
import com.spring_template.demo.order.domain.OrderRepository;
import com.spring_template.demo.order.infrastructure.repository.jpa.OrderEntity;
import com.spring_template.demo.order.infrastructure.repository.jpa.OrderJPARepository;
import com.spring_template.demo.shared.domain.IdentifierVO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderJPARepository repository;
    private final ModelMapper modelMapper;

    @Override
    public Order save(Order order) {
        OrderEntity orderEntity = modelMapper.map(order, OrderEntity.class);
        orderEntity = repository.save(orderEntity);
        return modelMapper.map(orderEntity, Order.class);
    }

    @Override
    public Optional<Order> findById(IdentifierVO id) {
        OrderEntity orderEntity = repository.findById(id.getValue()).orElse(null);
        return Optional.ofNullable(modelMapper.map(orderEntity, Order.class));
    }

    @Override
    public List<Order> findAll() {
        return repository.findAll().stream().map(entity -> modelMapper.map(entity, Order.class))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Order entity) {
        OrderEntity orderEntity = modelMapper.map(entity, OrderEntity.class);
        repository.delete(orderEntity);
    }
}
