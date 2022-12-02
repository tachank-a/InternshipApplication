package ru.gildo.application.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

import ru.gildo.application.model.entity.enums.TransactionType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Column(name = "date_of_creation")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateOfCreation;

    @NotNull
    @Column(name = "total")
    private double total;

    @NotNull
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;


    @ManyToOne
    @JoinColumn(name = "sender",referencedColumnName = "id")
    private Account senderAccount;

    @ManyToOne
    @JoinColumn(name = "receiver",referencedColumnName = "id")
    private Account receiverAccount;

    @OneToMany(mappedBy = "transaction")
    private Set<Order> orders;


}
