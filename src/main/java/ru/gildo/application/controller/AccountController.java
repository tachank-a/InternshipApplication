package ru.gildo.application.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.gildo.application.dto.AccountDTO;
import ru.gildo.application.service.impl.AccountServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController {
    private final AccountServiceImpl accountService;

    @GetMapping("/accounts/{id}")
    public ResponseEntity<List<AccountDTO>> getClientAccounts(@PathVariable long id){
        return ResponseEntity.ok(accountService.getAccountsByClientId(id));
    }
}
