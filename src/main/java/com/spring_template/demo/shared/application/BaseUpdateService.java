package com.spring_template.demo.shared.application;

public interface BaseUpdateService<I, O> {
    O execute(I input);
}
