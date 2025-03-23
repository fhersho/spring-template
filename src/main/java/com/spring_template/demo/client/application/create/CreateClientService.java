package com.spring_template.demo.client.application.create;

import com.spring_template.demo.client.domain.Client;
import com.spring_template.demo.client.domain.ClientRepository;
import com.spring_template.demo.shared.application.BaseCreateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateClientService implements BaseCreateService<CreateClientInput, CreateClientOutput> {

    private final ClientRepository clientRepository;
    private final CreateClientMapper mapper;

    @Override
    public CreateClientOutput execute(CreateClientInput input) {
        Client client = mapper.toEntity(input);
        client = clientRepository.save(client);
        return mapper.toDto(client);
    }
}
