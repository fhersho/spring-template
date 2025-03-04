package com.spring_template.demo.service;

import com.spring_template.demo.client.infraestructure.repository.jpa.ClientJPARepository;
import com.spring_template.demo.dto.client.ClientDto;
import com.spring_template.demo.dto.client.NewClientDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClientService {

    private final ClientJPARepository clientRepository;

    public ClientDto save(NewClientDto newClientDto) {
        Client client = new Client();
        client.setName(newClientDto.name());
        client.setDescription(newClientDto.description());
        client.setDebt(0);
        client = clientRepository.save(client);

        return new ClientDto(client.getId(), client.getName(), client.getDescription(), client.getDebt());
    }

    public ClientDto findById(Integer id) {
        Client client = clientRepository.findById(id).orElseThrow();
        return new ClientDto(client.getId(), client.getName(), client.getDescription(), client.getDebt());
    }

    public List<ClientDto> getAll() {
        return clientRepository.findAll().stream()
                .map(client -> new ClientDto(client.getId(), client.getName(), client.getDescription(), client.getDebt()))
                .collect(Collectors.toList());
    }

}
