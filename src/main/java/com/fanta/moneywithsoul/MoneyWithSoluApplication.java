package com.fanta.moneywithsoul;

import static com.fanta.database.MigrationFlyway.migrationWihFlyway;
import static com.fanta.database.PoolConfig.dataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class MoneyWithSoluApplication {

    public static void main(String[] args) {
//        SpringApplication.run(MoneyWithSoluApplication.class, args);
        migrationWihFlyway();
        dataSource();
    }

}
