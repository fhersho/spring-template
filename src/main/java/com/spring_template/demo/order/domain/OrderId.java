package com.spring_template.demo.order.domain;

import com.spring_template.demo.shared.domain.IdentifierVO;


class OrderId extends IdentifierVO {

    public OrderId(Integer value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
