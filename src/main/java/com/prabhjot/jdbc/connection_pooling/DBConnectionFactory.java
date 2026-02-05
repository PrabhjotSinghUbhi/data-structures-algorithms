package com.prabhjot.jdbc.connection_pooling;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * creating a connection and closing it for every query to database is a very expensive operation.
 * this is where the connection pool comes in, it provides a concept of reusable connection and borrowing and returning them instead of creating and destroying them every time.
 * * ConnectionPool → Reused Connections → High Performance
 * HikariCP (industry standard)
 * Central ConnectionFactory
 * Remove DriverManager from DAO
 */
//This class creates ONE pool for the entire application.
public class DBConnectionFactory {
    private static HikariDataSource dataSource;

    static {
        String url = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");

        if (url == null || user == null || password == null) {
            throw new RuntimeException("Database environment variables not set");
        }

        HikariConfig hikariConfig = new HikariConfig();

        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(user);
        hikariConfig.setPassword(password);

        hikariConfig.setMaximumPoolSize(10);
        hikariConfig.setMinimumIdle(3);
        hikariConfig.setIdleTimeout(30000);
        hikariConfig.setConnectionTimeout(20000);

        dataSource = new HikariDataSource(hikariConfig);
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

}
