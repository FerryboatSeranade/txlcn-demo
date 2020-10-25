package com.hand.txlcn.bank.consumer;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.hand.txlcn.bank.consumer.mapper")
@EnableDiscoveryClient
@EnableFeignClients
//开启分布式事务
@EnableDistributedTransaction
@SpringBootApplication
public class BankConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankConsumerApplication.class, args);
	}

}