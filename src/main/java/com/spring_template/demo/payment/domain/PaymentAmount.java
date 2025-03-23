package com.spring_template.demo.payment.domain;

import com.spring_template.demo.shared.domain.IntegerVO;


class PaymentAmount extends IntegerVO {
    public PaymentAmount(Integer value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
