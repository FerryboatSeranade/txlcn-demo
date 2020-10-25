package com.hand.txlcn.account.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/account")
public interface AccountInterface {
    @GetMapping("/add-money")
    Boolean addMoney(@RequestParam("money") int money,
                     @RequestParam("user") String user);
}
