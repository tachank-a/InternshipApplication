package ru.gildo.application.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.gildo.application.model.entity.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    // переименовать клиентов на акки
    @Query("select order from Order order where order.account.id=:id")
    List<Order> findOrdersByAccountId(@Param("id") long id);
}
