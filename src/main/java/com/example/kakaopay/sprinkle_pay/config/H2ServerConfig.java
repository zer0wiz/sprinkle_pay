package com.example.kakaopay.sprinkle_pay.config;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.context.annotation.*;

@Configuration
public class H2ServerConfig {

    @Bean
    public Server h2TcpServer() throws SQLException {
        return Server.createTcpServer().start();
    }
}