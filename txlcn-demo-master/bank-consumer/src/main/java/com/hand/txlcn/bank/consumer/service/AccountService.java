package com.hand.txlcn.bank.consumer.service;

public interface AccountService {
    Boolean transferAccounts(int money, String userFrom, String userTo);
}
