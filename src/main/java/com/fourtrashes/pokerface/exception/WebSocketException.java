package com.fourtrashes.pokerface.exception;

import com.fourtrashes.pokerface.constants.ExceptionType;
import org.springframework.messaging.MessageDeliveryException;

public class WebSocketException extends MessageDeliveryException {
    private ExceptionType type;

    public WebSocketException(String description, ExceptionType type) {
        super(description);
        this.type = type;
    }

    public String getErrorCode() {
        return this.type.getCode();
    }
    public String getErrorMessage() {
        return this.type.getMessage();
    }
}
