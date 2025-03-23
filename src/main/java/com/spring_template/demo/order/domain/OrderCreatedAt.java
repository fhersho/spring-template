package com.spring_template.demo.order.domain;

import com.spring_template.demo.shared.domain.DateVO;

import java.util.Date;


class OrderCreatedAt extends DateVO {
    public OrderCreatedAt(Date value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
