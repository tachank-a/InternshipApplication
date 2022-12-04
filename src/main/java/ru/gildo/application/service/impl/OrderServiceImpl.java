package ru.gildo.application.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gildo.application.dto.OrderDTO;
import ru.gildo.application.dto.mapper.OrderMapperImpl;
import ru.gildo.application.model.entity.Order;
import ru.gildo.application.model.repository.OrderRepository;
import ru.gildo.application.service.OrderService;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

private final OrderRepository orderRepository;
private final OrderMapperImpl orderMapper;

    @Override
    public List<OrderDTO> getOrdersByAccountId(long id) {
        List<Order> orders = orderRepository.findOrdersByAccountId(id);
        return orderMapper.toDTO(orders);
    }
}
