package com.spring_template.demo.client.application.update;

import com.spring_template.demo.client.domain.Client;
import com.spring_template.demo.client.domain.ClientRepository;
import com.spring_template.demo.shared.application.BaseUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateClientService implements BaseUpdateService<UpdateClientInput, UpdateClientOutput> {

    private final ClientRepository clientRepository;
    private final UpdateClientMapper mapper;

    @Override
    public UpdateClientOutput execute(UpdateClientInput input) {
        Client client = clientRepository.findById(input.id())
                .orElseThrow(() -> new RuntimeException("Client not found"));
        client.setName(input.name());
        client.setDescription(input.description());

        client = clientRepository.save(client);
        return mapper.toDto(client);
    }
}
