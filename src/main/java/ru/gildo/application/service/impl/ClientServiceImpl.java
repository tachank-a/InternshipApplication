package ru.gildo.application.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gildo.application.dto.ClientDTO;
import ru.gildo.application.dto.mapper.ClientMapperImpl;
import ru.gildo.application.model.entity.Client;
import ru.gildo.application.model.repository.ClientRepository;
import ru.gildo.application.service.ClientService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapperImpl clientMapper;

    @Override
    public List<ClientDTO> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return clientMapper.toDTO(clients);
    }

    @Override
    public Optional<ClientDTO> getClientById(long id) {
        return clientRepository.findById(id)
                .map(client -> ClientDTO.builder()
                        .id(client.getId())
                        .firstName(client.getFirstName())
                        .lastName(client.getLastName())
                        .patronymic(client.getPatronymic())
                        .build()
                );
    }
}
