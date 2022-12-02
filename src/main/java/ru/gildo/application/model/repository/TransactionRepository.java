package ru.gildo.application.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gildo.application.model.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
