package ru.gildo.application.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.gildo.application.dto.OrderDTO;
import ru.gildo.application.service.impl.OrderServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
public class OrderController {

    private final OrderServiceImpl orderService;

    @GetMapping("/orders/{id}")
    public ResponseEntity<List<OrderDTO>> getOrdersByAccountId(@PathVariable long id){
        return ResponseEntity.ok(orderService.getOrdersByAccountId(id));
    }
}
