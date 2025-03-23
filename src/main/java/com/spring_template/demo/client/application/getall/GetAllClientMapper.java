package com.spring_template.demo.client.application.getall;

import com.spring_template.demo.client.domain.Client;

public class GetAllClientMapper {

    public static Client toEntity(GetAllClientInput input) {
        return null;
    }

    public static GetAllClientOutput toDto(Client client) {
        return new GetAllClientOutput(
                client.getId(),
                client.getName(),
                client.getDescription(),
                client.getDebt(),
                client.getCreatedAt());
    }
}
