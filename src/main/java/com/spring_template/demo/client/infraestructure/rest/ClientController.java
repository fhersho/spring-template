package com.spring_template.demo.client.infraestructure.rest;

import com.spring_template.demo.client.application.ClientService;
import com.spring_template.demo.client.application.create.CreateClientInput;
import com.spring_template.demo.client.application.create.CreateClientOutput;
import com.spring_template.demo.client.application.getall.GetAllClientInput;
import com.spring_template.demo.client.application.getall.GetAllClientOutput;
import com.spring_template.demo.client.application.getbyid.GetByIdClientOutput;
import com.spring_template.demo.client.application.update.UpdateClientInput;
import com.spring_template.demo.client.application.update.UpdateClientOutput;
import com.spring_template.demo.shared.infrastructure.rest.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController implements BaseController<GetAllClientInput, GetAllClientOutput, GetByIdClientOutput, CreateClientInput, CreateClientOutput, UpdateClientInput, UpdateClientOutput> {

    private final ClientService clientService;

    @GetMapping()
    @Override
    public ResponseEntity<List<GetAllClientOutput>> getAll() {
        return ResponseEntity.ok(this.clientService.getAll(new GetAllClientInput()));
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<GetByIdClientOutput> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(this.clientService.findById(id));
    }

    @PostMapping()
    @Override
    public ResponseEntity<CreateClientOutput> create(@RequestBody CreateClientInput input) {
        return new ResponseEntity<>(this.clientService.save(input), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<UpdateClientOutput> update(@PathVariable Integer id, @RequestBody UpdateClientInput input) {
        return new ResponseEntity<>(this.clientService.update(input), HttpStatus.CREATED);
    }
}