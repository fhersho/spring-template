package com.spring_template.demo.client.application.create;

import com.spring_template.demo.client.domain.Client;
import org.springframework.stereotype.Component;

@Component
public class CreateClientMapper {

    public Client toEntity(CreateClientInput input) {
        Client client = new Client();
        client.setName(input.name());
        client.setDescription(input.description());
        return client;
    }

    public CreateClientOutput toDto(Client client) {
        return new CreateClientOutput(
                client.getId(),
                client.getName(),
                client.getDescription(),
                client.getDebt(),
                client.getCreatedAt());
    }
}
