package ru.gildo.application.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gildo.application.model.dto.ClientDTO;
import ru.gildo.application.model.dto.mapper.ClientMapperImpl;
import ru.gildo.application.model.entity.Client;
import ru.gildo.application.model.repository.ClientRepository;
import ru.gildo.application.service.ClientService;

import java.util.List;
import java.util.Optional;

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
    public Optional<ClientDTO> getClientById(long id) {
        return clientRepository.findById(id)
                .map(client -> new ClientDTO(
                        client.getId(),
                        client.getFirstName(),
                        client.getLastName(),
                        client.getPatronymic())
                );
    }
}
