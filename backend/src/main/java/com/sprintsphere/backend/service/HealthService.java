package com.sprintsphere.backend.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public String getHealthStatus(){
        return "SpringSphere Backend Running";
    }
}
