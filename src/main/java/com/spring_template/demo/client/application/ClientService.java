package com.spring_template.demo.client.application;

import com.spring_template.demo.client.application.create.CreateClientInput;
import com.spring_template.demo.client.application.create.CreateClientOutput;
import com.spring_template.demo.client.application.create.CreateClientService;
import com.spring_template.demo.client.application.getall.GetAllClientInput;
import com.spring_template.demo.client.application.getall.GetAllClientOutput;
import com.spring_template.demo.client.application.getall.GetAllClientService;
import com.spring_template.demo.client.application.getbyid.GetByIdClientOutput;
import com.spring_template.demo.client.application.getbyid.GetByIdClientService;
import com.spring_template.demo.client.application.update.UpdateClientInput;
import com.spring_template.demo.client.application.update.UpdateClientOutput;
import com.spring_template.demo.client.application.update.UpdateClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final CreateClientService createClientService;
    private final GetAllClientService getAllClientService;
    private final GetByIdClientService getByIdClientService;
    private final UpdateClientService updateClientService;

    public CreateClientOutput save(CreateClientInput input) {
        return createClientService.execute(input);
    }

    public GetByIdClientOutput findById(Integer input) {
        return getByIdClientService.execute(input);
    }

    public UpdateClientOutput update(UpdateClientInput input) {
        return updateClientService.execute(input);
    }

    public List<GetAllClientOutput> getAll(GetAllClientInput input) {
        return getAllClientService.execute(input);
    }
}
