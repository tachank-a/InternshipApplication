package ru.gildo.application.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gildo.application.model.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
