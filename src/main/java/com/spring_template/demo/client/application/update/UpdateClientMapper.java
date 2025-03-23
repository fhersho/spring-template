package com.spring_template.demo.client.application.update;

import com.spring_template.demo.client.domain.Client;
import org.springframework.stereotype.Component;

@Component
public class UpdateClientMapper {

    public Client toEntity(UpdateClientInput input) {
        Client client = new Client();
        client.setId(input.id());
        client.setName(input.name());
        client.setDescription(input.description());
        return client;
    }

    public UpdateClientOutput toDto(Client client) {
        return new UpdateClientOutput(
                client.getId(),
                client.getName(),
                client.getDescription(),
                client.getDebt(),
                client.getUpdatedAt().toString());
    }
}
