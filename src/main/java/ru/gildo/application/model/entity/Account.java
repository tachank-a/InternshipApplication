package ru.gildo.application.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @NotNull
    @Column(name = "account_number")
    private long accountNumber;

    @NotNull
    @Column(name = "amount")
    private double amount;

    @NotNull
    @Column(name = "type")
    private String type;

    @NotNull
    @Column(name = "opening_date")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime openingDate;

    @NotNull
    @Column(name = "validity")
    private int validity;

    @OneToMany(mappedBy = "account")
    private List<Order> order;


}
