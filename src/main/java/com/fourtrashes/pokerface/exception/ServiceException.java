package com.fourtrashes.pokerface.exception;

import com.fourtrashes.pokerface.constants.ExceptionType;

public class ServiceException extends RuntimeException {
    private ExceptionType type;

    public ServiceException(ExceptionType type) {
        this.type = type;
    }

    public String getErrorCode() {
        return this.type.getCode();
    }

    public String getErrorMessage() {
        return this.type.getMessage();
    }
}