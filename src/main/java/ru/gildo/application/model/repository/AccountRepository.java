package ru.gildo.application.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gildo.application.model.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
