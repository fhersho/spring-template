package com.spring_template.demo.shared.application;

public interface BaseGetByIdService<O> {

    O execute(Integer i);
}
