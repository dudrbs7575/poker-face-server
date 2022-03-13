package com.fourtrashes.pokerface.dto;

import com.fourtrashes.pokerface.exception.ServiceException;
import lombok.Data;

@Data
public class ErrorDTO {
    private String code;
    private String message;

    public ErrorDTO(ServiceException e) {
        this.code = e.getErrorCode();
        this.message = e.getErrorMessage();
    }
}
