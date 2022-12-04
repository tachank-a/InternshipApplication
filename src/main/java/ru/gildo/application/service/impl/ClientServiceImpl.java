package ru.gildo.application.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gildo.application.model.dto.ClientDTO;
import ru.gildo.application.model.dto.mapper.ClientMapperImpl;
import ru.gildo.application.model.entity.Client;
import ru.gildo.application.model.repository.ClientRepository;
import ru.gildo.application.service.ClientService;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapperImpl mapper;

    @Override
    public List<ClientDTO> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return mapper.toDTO(clients);
    }

    @Override
    public ClientDTO getClientById(long id) {
        Client client = clientRepository.findById(id).get();
        return mapper.toDTO(client);
    }
}
