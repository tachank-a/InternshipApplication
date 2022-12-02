package ru.gildo.application.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.gildo.application.model.entity.enums.ExecutionResult;
import ru.gildo.application.model.entity.enums.OrderType;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "order_type")
    private OrderType orderType;

    @NotNull
    @Column(name = "order_amount")
    private double orderAmount;

    @ManyToOne
    @JoinColumn(name = "account_id",nullable = false)
    private Account account;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "execution_result")
    private ExecutionResult executionResult;

    @NotNull
    @Column(name = "date_of_creation")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateOfCreation;

    @OneToOne(mappedBy = "order")
    private Transaction transaction;
}
