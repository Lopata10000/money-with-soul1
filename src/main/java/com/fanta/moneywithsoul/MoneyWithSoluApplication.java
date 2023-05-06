package com.fanta.moneywithsoul;

import static com.fanta.moneywithsoul.database.MigrationFlyway.migrationWihFlyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoneyWithSoluApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneyWithSoluApplication.class, args);
        migrationWihFlyway();
    }

}
