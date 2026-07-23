package com.sprintsphere.backend.dto;

public class ApiResponse {

    private String message;

    private boolean success;

    private Object data;

    public ApiResponse(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
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