package com.spring_template.demo.shared.application;

import java.util.List;

public interface BaseGetListService<I, O> {

    List<O> execute(I i);
}
