package com.spring_template.demo.shared.application.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponseDto {

    private final int status;
    private final String error;
    private final String message;

    public ErrorResponseDto(HttpStatus httpStatus, String message) {
        this.status = httpStatus.value();
        this.error = httpStatus.getReasonPhrase();
        this.message = message;
    }
}

