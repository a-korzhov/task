package com.korzhov.task.exception;

import org.springframework.http.ResponseEntity;

public final class ErrorResponseEntityBuilder {

    public static ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

}
