package com.spring_template.demo.shared.domain;

import java.util.Objects;

public abstract class StringVO implements ValueObject {
    private final String value;

    protected StringVO(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StringVO)) {
            return false;
        }
        StringVO that = (StringVO) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}