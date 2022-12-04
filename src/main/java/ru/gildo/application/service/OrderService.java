package ru.gildo.application.service;

import ru.gildo.application.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getOrdersByAccountId(long id);
}
