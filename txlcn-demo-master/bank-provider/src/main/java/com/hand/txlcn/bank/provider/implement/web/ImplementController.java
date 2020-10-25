package com.hand.txlcn.bank.provider.implement.web;
import com.hand.txlcn.account.api.AccountInterface;
import com.hand.txlcn.bank.provider.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ImplementController implements AccountInterface {
    @Autowired
    private AccountServiceImpl accountServiceImpl;

    public Boolean addMoney(@RequestParam("money") int money,
                            @RequestParam("user") String user) {
        return accountServiceImpl.addMoney(money, user);
    }
}
