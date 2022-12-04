package ru.gildo.application.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.gildo.application.model.entity.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("select transaction from Transaction transaction " +
            "where transaction.senderAccount.id =:id or transaction.receiverAccount.id=:id")
    List<Transaction> findTransactionsByAccountId(@Param("id") long id);

}
