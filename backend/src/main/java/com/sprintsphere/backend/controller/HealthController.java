package com.sprintsphere.backend.controller;

import com.sprintsphere.backend.dto.ApiResponse;
import com.sprintsphere.backend.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/api/v1/health")
    public ApiResponse health() {
        return new ApiResponse(true, healthService.getHealthStatus(), null);
    }
}