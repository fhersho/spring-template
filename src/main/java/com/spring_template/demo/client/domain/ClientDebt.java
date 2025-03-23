package com.spring_template.demo.client.domain;

import com.spring_template.demo.shared.domain.IntegerVO;

class ClientDebt extends IntegerVO {
    public ClientDebt(Integer value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
