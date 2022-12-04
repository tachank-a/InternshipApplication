package ru.gildo.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;



@Data
@AllArgsConstructor
@Builder
public class ClientDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String patronymic;
}
