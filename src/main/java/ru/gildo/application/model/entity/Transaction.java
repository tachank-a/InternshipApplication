package ru.gildo.application.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

import ru.gildo.application.model.entity.enums.ExecutionResult;
import ru.gildo.application.model.entity.enums.TransactionType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "execution_result")
    private ExecutionResult executionResult;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "sender_id",referencedColumnName = "id")
    private Account senderAccount;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "receive_id",referencedColumnName = "id")
    private Account receiverAccount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id",nullable = false)
    private Order order;


}
