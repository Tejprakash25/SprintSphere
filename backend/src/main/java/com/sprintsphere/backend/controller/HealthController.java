package com.sprintsphere.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sprintsphere.backend.service.HealthService;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/api/v1/health")
    public String health() {
        return healthService.getHealthStatus();
    }
}