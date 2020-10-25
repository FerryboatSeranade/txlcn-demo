package com.hand.txlcn.bank.consumer.service.impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.hand.txlcn.account.domain.Account;
import com.hand.txlcn.bank.consumer.client.BankProviderClient;
import com.hand.txlcn.bank.consumer.mapper.AccountMapper;
import com.hand.txlcn.bank.consumer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private BankProviderClient bankProviderClient;

    @Override
//    @LcnTransaction(propagation = DTXPropagation.REQUIRED) //分布式事务注解
    @Transactional
    public Boolean transferAccounts(int money, String userFrom, String userTo) {
        Account myAccount = new Account();
        myAccount.setMoney(money);
        myAccount.setUser(userFrom);
        accountMapper.subMoney(myAccount);
        bankProviderClient.addMoney(money, userTo);//调用bank-provider服务
        int i = 1 / 0;
        return true;
    }
}