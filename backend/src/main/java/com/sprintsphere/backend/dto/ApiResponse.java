package com.sprintsphere.backend.dto;

import java.time.LocalDateTime;

public class ApiResponse {

    private String message;

    private boolean success;

    private Object data;

    private LocalDateTime timestamp;

    private int status;

    public ApiResponse(boolean success, int status, String message, Object data) {
        this.success = success;
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    public int getStatus(){
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Object getData(){
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}