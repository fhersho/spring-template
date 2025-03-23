package com.spring_template.demo.client.infraestructure.repository.jpa;

import com.spring_template.demo.client.domain.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "clients")
public class ClientEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String description;
    private Integer debt;
    private Date createdAt;
    private Date updatedAt;

    public static Client toDomain(ClientEntity entity) {
        if (entity == null) {
            return null;
        }
        Client client = new Client();
        client.setId(entity.getId());
        client.setName(entity.getName());
        client.setDescription(entity.getDescription());
        client.setDebt(entity.getDebt());
        client.setCreatedAt(entity.getCreatedAt());
        client.setUpdatedAt(entity.getUpdatedAt());
        return client;
    }

    public static ClientEntity toEntity(Client client) {
        if (client == null) {
            return null;
        }
        ClientEntity entity = new ClientEntity();
        entity.setId(client.getId());
        entity.setName(client.getName());
        entity.setDescription(client.getDescription());
        entity.setDebt(client.getDebt());
        entity.setCreatedAt(client.getCreatedAt());
        entity.setUpdatedAt(client.getUpdatedAt());
        return entity;
    }

}
