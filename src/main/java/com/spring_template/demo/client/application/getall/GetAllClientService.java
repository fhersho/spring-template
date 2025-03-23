package com.spring_template.demo.client.application.getall;

import com.spring_template.demo.client.domain.ClientRepository;
import com.spring_template.demo.shared.application.BaseGetListService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GetAllClientService implements BaseGetListService<GetAllClientInput, GetAllClientOutput> {

    private final ClientRepository clientRepository;


    @Override
    public List<GetAllClientOutput> execute(GetAllClientInput getAllClientInput) {
        return clientRepository.findAll().stream()
                .map(entity -> GetAllClientMapper.toDto(entity))
                .collect(Collectors.toList());
    }
}
