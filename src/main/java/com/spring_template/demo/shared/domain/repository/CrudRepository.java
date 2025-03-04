package com.spring_template.demo.shared.domain.repository;


import com.spring_template.demo.shared.domain.IdentifierVO;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    T save(T entity);

    Optional<T> findById(IdentifierVO id);

    List<T> findAll();

    void delete(T entity);
}