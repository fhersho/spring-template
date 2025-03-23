package com.spring_template.demo.payment.domain;

import com.spring_template.demo.shared.domain.IdentifierVO;


class PaymentClientId extends IdentifierVO {

    public PaymentClientId(Integer value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
