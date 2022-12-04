package ru.gildo.application.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.gildo.application.dto.TransactionDTO;
import ru.gildo.application.model.entity.Transaction;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    @Mapping(target = "senderId",expression = "java(transaction.getSenderAccount().getId())")
    @Mapping(target = "receiverId",expression = "java(transaction.getReceiverAccount().getId())")
    @Mapping(target = "orderId",expression = "java(transaction.getOrder().getId())")
    TransactionDTO toDTO(Transaction transaction);

    Transaction toModel(TransactionDTO transactionDTO);

    List<TransactionDTO> toDTO(List<Transaction> transactions);

    List<Transaction> toModel(List<TransactionDTO> transactionDTOS);
}
