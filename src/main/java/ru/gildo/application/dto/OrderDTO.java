package ru.gildo.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.gildo.application.model.entity.enums.ExecutionResult;
import ru.gildo.application.model.entity.enums.OrderType;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    private long id;
    private long accountId;
    private OrderType orderType;
    private double orderAmount;
    private ExecutionResult executionResult;
    private LocalDateTime dateOfCreation;
    //private String secretWord;
}
