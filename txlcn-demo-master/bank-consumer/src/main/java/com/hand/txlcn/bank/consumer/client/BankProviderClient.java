package com.hand.txlcn.bank.consumer.client;

import com.hand.txlcn.account.api.AccountInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "bank-provider")
public interface BankProviderClient extends AccountInterface {
}