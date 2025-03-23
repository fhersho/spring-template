package com.spring_template.demo.shared.domain.repository;


import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    T save(T entity);

    Optional<T> findById(Integer id);

    List<T> findAll();

    void delete(T entity);
}