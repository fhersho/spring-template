package com.spring_template.demo.client.application.getall;

import java.util.Date;

public record GetAllClientOutput(Integer id, String name, String description, Integer debt, Date createdAt) {
}
