package com.spring_template.demo.controller;

import com.spring_template.demo.dto.client.ClientDto;
import com.spring_template.demo.dto.client.NewClientDto;
import com.spring_template.demo.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping()
    public ResponseEntity<List<ClientDto>> getAll() {
        return ResponseEntity.ok(clientService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDto> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(clientService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<ClientDto> save(@RequestBody NewClientDto clientDto) {
        return ResponseEntity.ok(clientService.save(clientDto));
    }
}