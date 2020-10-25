package com.hand.txlcn.bank.provider;
import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//开启分布式事务
@EnableDistributedTransaction
@SpringBootApplication
public class BankProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankProviderApplication.class, args);
    }

}