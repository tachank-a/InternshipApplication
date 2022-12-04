package ru.gildo.application.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ru.gildo.application.model.dto.ClientDTO;
import ru.gildo.application.service.impl.ClientServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientController {

    private final ClientServiceImpl clientService;

    @GetMapping("/clients")
    public ResponseEntity<List<ClientDTO>> getClients(){
        return ResponseEntity.ok(clientService.getAllClients());
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<ClientDTO> getClientById(@PathVariable long id){
        return ResponseEntity.ok(clientService.getClientById(id));
    }
}
