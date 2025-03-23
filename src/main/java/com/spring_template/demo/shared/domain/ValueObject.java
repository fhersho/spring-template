package com.spring_template.demo.shared.domain;

public interface ValueObject {
    Object getValue();

    void ensureValid() throws IllegalArgumentException;
}
