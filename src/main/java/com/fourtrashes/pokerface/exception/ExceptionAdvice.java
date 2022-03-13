package com.fourtrashes.pokerface.exception;

import com.fourtrashes.pokerface.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(ServiceException.class)
    protected ResponseEntity<ErrorDTO> serviceExceptionHandler(ServiceException e) {
        return new ResponseEntity(new ErrorDTO(e), HttpStatus.OK);
    }
}
