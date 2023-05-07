package com.fanta.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class PoolConfig implements DataBaseConfig {
    private static HikariDataSource dataSource;

    static {
        HikariConfig pullConfiguration = new HikariConfig();
        pullConfiguration.setJdbcUrl(url);
        pullConfiguration.setUsername(user);
        pullConfiguration.setPassword(password);
        pullConfiguration.setMaximumPoolSize(10);
        pullConfiguration.setConnectionTimeout(5000);
        pullConfiguration.setMaxLifetime(1800000);
        pullConfiguration.setPoolName("money-with-soul Pool");
        dataSource = new HikariDataSource(pullConfiguration);
    }


    public static void Test() {

        try (Connection connection = dataSource.getConnection()) {
            if (connection != null) {
                System.out.println("Успішно створено пулл");
            } else {
                System.out.println("Не створено пул");
            }
        } catch (SQLException exception) {
            System.out.println("помилка");
        }
    }

    public void closeDataSource(DataSource dataSource) {
        if (dataSource instanceof HikariDataSource) {
            ((HikariDataSource) dataSource).close();
        }
    }
}
