package com.hand.txlcn.bank.consumer.controller;

import com.hand.txlcn.bank.consumer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/transferAccounts")
    public Boolean transferAccounts(@RequestParam int money,
                                    @RequestParam String userFrom,
                                    @RequestParam String userTo) {
        return accountService.transferAccounts(money, userFrom, userTo);
    }

}
