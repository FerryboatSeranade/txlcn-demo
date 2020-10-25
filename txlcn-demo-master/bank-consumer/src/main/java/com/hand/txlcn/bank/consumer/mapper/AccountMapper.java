package com.hand.txlcn.bank.consumer.mapper;

import com.hand.txlcn.account.domain.Account;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {
    @Update("update t_bank set money = money-#{money} where user = #{user}")
    int subMoney(Account account);
}
