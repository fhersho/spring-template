package com.spring_template.demo.payment.domain;

import com.spring_template.demo.shared.domain.DateVO;

import java.util.Date;


class PaymentCreatedAt extends DateVO {
    public PaymentCreatedAt(Date value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
