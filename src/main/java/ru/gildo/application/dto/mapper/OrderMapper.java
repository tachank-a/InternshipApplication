package ru.gildo.application.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.gildo.application.dto.OrderDTO;
import ru.gildo.application.model.entity.Order;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(target = "accountId",expression = "java(order.getAccount().getId())")
    OrderDTO toDTO(Order order);

    Order toModel(OrderDTO orderDTO);

    List<OrderDTO> toDTO(List<Order> orders);

    List<Order> toModel(List<OrderDTO> orderDTOS);
}
