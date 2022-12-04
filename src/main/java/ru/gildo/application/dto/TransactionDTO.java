package ru.gildo.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.gildo.application.model.entity.enums.ExecutionResult;
import ru.gildo.application.model.entity.enums.TransactionType;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDTO {
    private long id;
    private long senderId;
    private long receiverId;
    private double total;
    private ExecutionResult executionResult;
    private LocalDateTime dateOfCreation;
    private TransactionType transactionType;
    private long orderId;
//    private String secretWord;

}
