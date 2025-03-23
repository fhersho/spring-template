package com.spring_template.demo.client.domain;

import com.spring_template.demo.shared.domain.DateVO;

import java.util.Date;


class ClientCreatedAt extends DateVO {
    public ClientCreatedAt(Date value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
