package ru.gildo.application.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.gildo.application.dto.TransactionDTO;
import ru.gildo.application.service.impl.TransactionServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
public class TransactionController {
    private final TransactionServiceImpl transactionService;

    @GetMapping("/transactions/{id}")
    public ResponseEntity<List<TransactionDTO>> getTransactionsByClientId(@PathVariable long id) {
        return ResponseEntity.ok(transactionService.getTransactionsByClientId(id));
    }
}
