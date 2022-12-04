package ru.gildo.application.model.dto;

import lombok.Builder;
import lombok.Data;

import ru.gildo.application.model.entity.Account;

import java.util.List;

@Data
@Builder
public class ClientDTO {
    long id;
    String firstName;
    String lastName;
    String patronymic;
    String secretWord;
    List<Account> accounts;
}
