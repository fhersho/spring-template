package com.spring_template.demo.order.domain;

import com.spring_template.demo.shared.domain.DateVO;

import java.util.Date;


class OrderUpdatedAt extends DateVO {
    public OrderUpdatedAt(Date value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
