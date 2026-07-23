package com.sprintsphere.backend.dto;

public class ApiResponse {

    private String message;

    private boolean success;

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}