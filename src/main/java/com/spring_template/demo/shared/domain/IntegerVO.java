package com.spring_template.demo.shared.domain;

import java.util.Objects;

public abstract class IntegerVO implements ValueObject {
    private final Integer value;

    public IntegerVO(Integer value) {
        this.value = value;
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
        IntegerVO that = (IntegerVO) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
