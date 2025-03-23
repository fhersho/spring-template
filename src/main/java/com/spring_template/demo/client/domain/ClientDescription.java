package com.spring_template.demo.client.domain;

import com.spring_template.demo.shared.domain.StringVO;

class ClientDescription extends StringVO {
    public ClientDescription(String value) {
        super(value);
    }

    @Override
    public void ensureValid() throws IllegalArgumentException {

    }
}
