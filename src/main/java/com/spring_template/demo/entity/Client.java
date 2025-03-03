package com.spring_template.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clients")
public class Client extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "increment")
    private Integer id;

    private String name;
    private String description;
    private Integer debt;
}
