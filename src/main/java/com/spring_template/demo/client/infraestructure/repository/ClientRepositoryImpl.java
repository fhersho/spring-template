package com.spring_template.demo.client.infraestructure.repository;

import com.spring_template.demo.client.domain.Client;
import com.spring_template.demo.client.domain.ClientRepository;
import com.spring_template.demo.client.infraestructure.repository.jpa.ClientEntity;
import com.spring_template.demo.client.infraestructure.repository.jpa.ClientJPARepository;
import com.spring_template.demo.shared.domain.IdentifierVO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ClientRepositoryImpl implements ClientRepository {

    private final ClientJPARepository repository;
    private final ModelMapper modelMapper;

    @Override
    public Client save(Client client) {
        ClientEntity clientEntity = modelMapper.map(client, ClientEntity.class);
        clientEntity = repository.save(clientEntity);
        return modelMapper.map(clientEntity, Client.class);
    }

    @Override
    public Optional<Client> findById(IdentifierVO id) {
        ClientEntity clientEntity = repository.findById(id.getValue()).orElse(null);
        return Optional.ofNullable(modelMapper.map(clientEntity, Client.class));
    }

    @Override
    public List<Client> findAll() {
        return repository.findAll().stream().map(entity -> modelMapper.map(entity, Client.class))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Client entity) {
        ClientEntity clientEntity = modelMapper.map(entity, ClientEntity.class);
        repository.delete(clientEntity);
    }
}
