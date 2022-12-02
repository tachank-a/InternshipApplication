package ru.gildo.application.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gildo.application.model.entity.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
