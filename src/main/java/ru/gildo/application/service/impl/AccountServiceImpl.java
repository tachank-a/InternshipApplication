package ru.gildo.application.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gildo.application.dto.AccountDTO;


import ru.gildo.application.dto.mapper.AccountMapperImpl;
import ru.gildo.application.model.entity.Account;
import ru.gildo.application.model.repository.AccountRepository;
import ru.gildo.application.service.AccountService;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapperImpl accountMapper;
    @Override
    public List<AccountDTO> getAccountsByClientId(long id) {
        List<Account> accounts = accountRepository.findAccountsByClientId(id);
        return accountMapper.toDTO(accounts);
    }
}
