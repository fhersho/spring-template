package com.spring_template.demo.order.domain;

import com.spring_template.demo.shared.domain.DateVO;

import java.util.Date;


public class OrderCreatedAtVO extends DateVO {
    public OrderCreatedAtVO(Date value) {
        super(value);
    }
}
