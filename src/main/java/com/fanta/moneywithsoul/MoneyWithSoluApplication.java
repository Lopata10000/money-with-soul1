package com.fanta.moneywithsoul;

import static com.fanta.database.MigrationFlyway.migrationWihFlyway;

import com.fanta.database.PoolConfig;

// @SpringBootApplication
public class MoneyWithSoluApplication {

    public static void main(String[] args) {
        //        SpringApplication.run(MoneyWithSoluApplication.class, args);

        migrationWihFlyway();
        PoolConfig.Test();

    }
}
