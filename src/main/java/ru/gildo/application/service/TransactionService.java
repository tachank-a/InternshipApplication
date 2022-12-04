package ru.gildo.application.service;

import ru.gildo.application.dto.TransactionDTO;

import java.util.List;

public interface TransactionService {
    List<TransactionDTO> getTransactionsByClientId(long id);
}
