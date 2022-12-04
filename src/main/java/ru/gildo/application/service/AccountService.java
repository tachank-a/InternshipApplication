package ru.gildo.application.service;

import ru.gildo.application.dto.AccountDTO;


import java.util.List;


public interface AccountService {
List<AccountDTO> getAccountsByClientId(long id);
}
