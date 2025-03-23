package com.spring_template.demo.order.domain;

import com.spring_template.demo.shared.domain.IntegerVO;


class OrderAmount extends IntegerVO {
    public OrderAmount(Integer value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
