package ru.gildo.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDTO {
    private long id;
    private long accountNumber;
    private double amount;
    private LocalDateTime openingDate;
    private String type;
    private int validity;
}
