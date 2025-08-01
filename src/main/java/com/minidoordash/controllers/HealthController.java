package com.minidoordash.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> healthCheck() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "Mini DoorDash Backend");
        response.put("timestamp", System.currentTimeMillis());
        response.put("version", "1.0.0");
        response.put("environment", System.getenv("SPRING_PROFILES_ACTIVE") != null ? System.getenv("SPRING_PROFILES_ACTIVE") : "default");
        response.put("port", System.getenv("PORT") != null ? System.getenv("PORT") : "8080");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> rootHealthCheck() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("message", "Mini DoorDash Backend is running");
        response.put("timestamp", System.currentTimeMillis());
        return ResponseEntity.ok(response);
    }
} 