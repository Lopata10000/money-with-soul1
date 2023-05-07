package com.fanta.moneywithsoul;

import static com.fanta.database.MigrationFlyway.migrationWihFlyway;
import static com.fanta.database.PoolConfig.dataSource;

// @SpringBootApplication
public class MoneyWithSoluApplication {

    public static void main(String[] args) {
        //        SpringApplication.run(MoneyWithSoluApplication.class, args);
        migrationWihFlyway();
        dataSource();
    }
}
