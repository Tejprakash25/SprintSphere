package com.sprintsphere.backend.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sprintsphere.backend.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ApiResponse handleResourceNotFound(ResourceNotFoundException ex) {
        return new ApiResponse(
                false,
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                null
        );
    }
}