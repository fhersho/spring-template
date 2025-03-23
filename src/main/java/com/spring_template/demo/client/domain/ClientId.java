package com.spring_template.demo.client.domain;

import com.spring_template.demo.shared.domain.IdentifierVO;

class ClientId extends IdentifierVO {
    public ClientId(Integer value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
