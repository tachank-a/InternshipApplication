package ru.gildo.application.dto.mapper;

import org.mapstruct.Mapper;
import ru.gildo.application.dto.AccountDTO;
import ru.gildo.application.model.entity.Account;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    List<Account> toModel(List<AccountDTO> accountDTOS);
    List<AccountDTO> toDTO(List<Account> accounts);
}
