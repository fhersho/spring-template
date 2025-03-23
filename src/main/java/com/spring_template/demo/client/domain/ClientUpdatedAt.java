package com.spring_template.demo.client.domain;

import com.spring_template.demo.shared.domain.DateVO;

import java.util.Date;


class ClientUpdatedAt extends DateVO {
    public ClientUpdatedAt(Date value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
