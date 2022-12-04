package ru.gildo.application.service;

import ru.gildo.application.model.dto.ClientDTO;

import java.util.List;

public interface ClientService {

    List<ClientDTO> getAllClients();

    ClientDTO getClientById(long id);
}
