package com.spring_template.demo.payment.domain;

import com.spring_template.demo.shared.domain.IdentifierVO;


class PaymentId extends IdentifierVO {

    public PaymentId(Integer value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
