package com.fanta.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

@Configuration
public class PoolConfig implements DataBaseConfig {

        @Bean
        public static DataSource dataSource() {
            HikariConfig pullConfiguration = new HikariConfig();
            pullConfiguration.setJdbcUrl(url);
            pullConfiguration.setUsername(user);
            pullConfiguration.setPassword(password);
            pullConfiguration.setMaximumPoolSize(10);
            pullConfiguration.setConnectionTimeout(5000);
            pullConfiguration.setMaxLifetime(1800000);
            pullConfiguration.setPoolName("money-with-soul Pool");
            HikariDataSource dataSource = new HikariDataSource(pullConfiguration);
            try {
                Connection connection = dataSource().getConnection();

                connection.close();

            } catch (SQLException SQLException) {
                SQLException.printStackTrace();
            } finally {
                dataSource.close();
            }
            return new HikariDataSource(pullConfiguration);
        }
}
