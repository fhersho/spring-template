package com.spring_template.demo.client.application.create;

import java.util.Date;

public record CreateClientOutput(Integer id, String name, String description, Integer debt,
                                 Date createdAt) {
}
