package com.minidoordash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@SpringBootApplication
public class MiniDoorDashApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniDoorDashApplication.class, args);
    }
} 