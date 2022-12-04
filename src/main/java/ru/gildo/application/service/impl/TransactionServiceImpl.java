package ru.gildo.application.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gildo.application.dto.TransactionDTO;
import ru.gildo.application.dto.mapper.TransactionMapperImpl;
import ru.gildo.application.model.entity.Transaction;
import ru.gildo.application.model.repository.TransactionRepository;
import ru.gildo.application.service.TransactionService;

import java.util.List;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    private final TransactionMapperImpl transactionMapper;

    @Override
    public List<TransactionDTO> getTransactionsByClientId(long id) {
        List<Transaction> transactions = transactionRepository.findTransactionsByAccountId(id);
        return transactionMapper.toDTO(transactions);
    }
}
