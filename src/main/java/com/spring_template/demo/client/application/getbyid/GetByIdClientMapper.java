package com.spring_template.demo.client.application.getbyid;

import com.spring_template.demo.client.domain.Client;
import org.springframework.stereotype.Component;

@Component
public class GetByIdClientMapper {

    public Client toEntity(GetByIdClientInput input) {
        Client client = new Client();
        client.setId(input.id());
        return client;
    }

    public GetByIdClientOutput toDto(Client client) {
        return new GetByIdClientOutput(
                client.getId(),
                client.getName(),
                client.getDescription(),
                client.getDebt(),
                client.getCreatedAt().toString());
    }
}
