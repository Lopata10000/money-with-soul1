package com.fanta.moneywithsoul.database;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MigrationFlyway {
    private static final Logger logger = LoggerFactory.getLogger(MigrationFlyway.class);

    public static void  migrationWihFlyway() {

        String url = "jdbc:postgresql://localhost:5432/money-with-soul";
        String user = "postgres";
        String password = "45435";

        Flyway flyway =
                Flyway.configure()
                        .dataSource(url, user, password)
                        .locations("db/migration")
                        .load();
        flyway.migrate();
    }
}
