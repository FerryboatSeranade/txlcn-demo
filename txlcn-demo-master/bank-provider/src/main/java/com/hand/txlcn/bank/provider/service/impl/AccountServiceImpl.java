package com.hand.txlcn.bank.provider.service.impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.hand.txlcn.account.domain.Account;
import com.hand.txlcn.bank.provider.mapper.AccountMapper;
import com.hand.txlcn.bank.provider.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    //事物的参与方
//    @LcnTransaction(propagation = DTXPropagation.SUPPORTS)
    @Transactional
    public Boolean addMoney(int money, String user) {
        Account account = new Account();
        account.setMoney(money);
        account.setUser(user);
        accountMapper.addMoney(account);
        return true;
    }

}

