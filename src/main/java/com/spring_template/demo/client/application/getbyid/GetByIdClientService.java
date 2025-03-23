package com.spring_template.demo.client.application.getbyid;

import com.spring_template.demo.client.domain.ClientRepository;
import com.spring_template.demo.shared.application.BaseGetByIdService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetByIdClientService implements BaseGetByIdService<GetByIdClientOutput> {

    private final ClientRepository clientRepository;
    private final GetByIdClientMapper mapper;

    @Override
    public GetByIdClientOutput execute(Integer input) {
        return clientRepository.findById(input).stream()
                .map(client -> mapper.toDto(client))
                .findFirst().orElse(null);
    }
}
