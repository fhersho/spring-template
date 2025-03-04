package com.spring_template.demo.shared.domain;

import java.io.Serializable;
import java.util.Objects;

public abstract class IdentifierVO implements ValueObject, Serializable {
    private final Integer value;

    public IdentifierVO(Integer value) {
        ensureValid(value);
        this.value = value;
    }

    private void ensureValid(Integer value) throws IllegalArgumentException {
        if (value == null) {
            throw new IllegalArgumentException("Identifier cannot be null");
        }
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentifierVO that = (IdentifierVO) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}