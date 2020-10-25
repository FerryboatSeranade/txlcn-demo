package com.hand.txlcn.bank.provider.mapper;

import com.hand.txlcn.account.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccountMapper {

    @Update("update t_bank set money = money+#{money} where user = #{user}")
    int addMoney(Account account);
}