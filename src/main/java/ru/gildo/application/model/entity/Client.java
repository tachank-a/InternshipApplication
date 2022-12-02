package ru.gildo.application.model.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    private String patronymic;

    //secret
    @NotNull
    @Column(name = "secret_word")
    private String secretWord;

    @OneToMany(mappedBy = "client")
    private List<Account> accounts;
}
