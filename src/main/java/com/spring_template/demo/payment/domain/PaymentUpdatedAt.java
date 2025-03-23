package com.spring_template.demo.payment.domain;

import com.spring_template.demo.shared.domain.DateVO;

import java.util.Date;


class PaymentUpdatedAt extends DateVO {
    public PaymentUpdatedAt(Date value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
