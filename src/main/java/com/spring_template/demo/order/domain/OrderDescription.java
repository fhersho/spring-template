package com.spring_template.demo.order.domain;

import com.spring_template.demo.shared.domain.StringVO;


class OrderDescription extends StringVO {
    public OrderDescription(String value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
