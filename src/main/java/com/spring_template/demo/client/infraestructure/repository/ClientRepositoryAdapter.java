package com.spring_template.demo.client.infraestructure.repository;

import com.spring_template.demo.client.domain.Client;
import com.spring_template.demo.client.domain.ClientRepository;
import com.spring_template.demo.client.infraestructure.repository.jpa.ClientEntity;
import com.spring_template.demo.client.infraestructure.repository.jpa.ClientJPARepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClientRepositoryAdapter implements ClientRepository {

    private final ClientJPARepository repository;

    @Override
    public Client save(Client client) {
        ClientEntity clientEntity = ClientEntity.toEntity(client);
        clientEntity.setDebt(0);
        clientEntity.setCreatedAt(new Date());
        clientEntity = repository.save(clientEntity);

        return ClientEntity.toDomain(clientEntity);
    }

    @Override
    public Optional<Client> findById(Integer id) {
        ClientEntity clientEntity = repository.findById(id).orElse(null);
        return Optional.ofNullable(ClientEntity.toDomain(clientEntity));
    }

    @Override
    public List<Client> findAll() {
        return repository.findAll().stream().map(entity -> ClientEntity.toDomain(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Client entity) {
        ClientEntity clientEntity = ClientEntity.toEntity(entity);
        repository.delete(clientEntity);
    }
}
