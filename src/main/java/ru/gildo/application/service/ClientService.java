package ru.gildo.application.service;

import ru.gildo.application.model.dto.ClientDTO;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<ClientDTO> getAllClients();

    Optional<ClientDTO> getClientById(long id);
}
