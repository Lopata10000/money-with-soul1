package com.fanta.database;

import com.fanta.entity.User;
import com.fanta.service.MoneyWithSoulRepositoryImpl;
import com.fanta.service.MoneyWithSoulRepositoryInterface;
import com.fanta.service.MoneyWithSoulService;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            MoneyWithSoulRepositoryInterface repository = new MoneyWithSoulRepositoryImpl();
            MoneyWithSoulService moneyWithSoulService = new MoneyWithSoulService();
            User user1 = new User();
            user1.setEmail("Georg");
            moneyWithSoulService.addUser(user1);
            System.out.println("User created successfully.");
        } catch (SQLException e) {
            System.err.println("User creation failed: " + e.getMessage());
        }
    }

    public void closeDataSource(DataSource dataSource) {
        if (dataSource instanceof HikariDataSource) {
            ((HikariDataSource) dataSource).close();
        }
    }
}
