package com.spring_template.demo.shared.domain;

import java.util.Date;
import java.util.Objects;

public abstract class DateVO implements ValueObject {
    private final Date value;

    protected DateVO(Date value) {
        this.value = value;
    }

    @Override
    public Date getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DateVO)) {
            return false;
        }
        DateVO that = (DateVO) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}