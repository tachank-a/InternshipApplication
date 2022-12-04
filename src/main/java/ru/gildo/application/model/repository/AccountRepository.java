package ru.gildo.application.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.gildo.application.model.entity.Account;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {
    @Query("select account from Account account where account.client.id =:id")
    List<Account> findAccountsByClientId(@Param("id") long id);
}
