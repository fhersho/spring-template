package com.spring_template.demo.shared.infrastructure.rest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BaseController<GET_LIST_INPUT, GET_LIST_OUTPUT,
        GET_BY_ID_OUTPUT, SAVE_INPUT, SAVE_OUTPUT, UPDATE_INPUT, UPDATE_OUTPUT> {

    // @GetMapping()
    ResponseEntity<List<GET_LIST_OUTPUT>> getAll();

    ResponseEntity<GET_BY_ID_OUTPUT> findById(@PathVariable Integer id);

    ResponseEntity<SAVE_OUTPUT> create(SAVE_INPUT input);

    ResponseEntity<UPDATE_OUTPUT> update(Integer id, UPDATE_INPUT input);
}
