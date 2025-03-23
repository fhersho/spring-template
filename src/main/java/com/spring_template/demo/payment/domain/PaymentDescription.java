package com.spring_template.demo.payment.domain;

import com.spring_template.demo.shared.domain.StringVO;


class PaymentDescription extends StringVO {
    public PaymentDescription(String value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
