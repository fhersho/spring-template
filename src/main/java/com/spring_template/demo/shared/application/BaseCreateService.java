package com.spring_template.demo.shared.application;

public interface BaseCreateService<I, O> {
    O execute(I input);
}
