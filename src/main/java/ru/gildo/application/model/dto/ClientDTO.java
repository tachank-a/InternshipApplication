package ru.gildo.application.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;



@Data
@AllArgsConstructor
@Builder
public class ClientDTO {
    long id;
    String firstName;
    String lastName;
    String patronymic;
}
