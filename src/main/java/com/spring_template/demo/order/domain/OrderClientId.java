package com.spring_template.demo.order.domain;

import com.spring_template.demo.shared.domain.IdentifierVO;


class OrderClientId extends IdentifierVO {

    public OrderClientId(Integer value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
