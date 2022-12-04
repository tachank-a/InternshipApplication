package ru.gildo.application.model.dto.mapper;

import org.mapstruct.Mapper;
import ru.gildo.application.model.dto.ClientDTO;
import ru.gildo.application.model.entity.Client;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDTO toDTO(Client client);
    Client toModel(ClientDTO dto);

    List<ClientDTO> toDTO(List<Client> clients);
    List<Client> toModel(List<ClientDTO> dtos);
}
