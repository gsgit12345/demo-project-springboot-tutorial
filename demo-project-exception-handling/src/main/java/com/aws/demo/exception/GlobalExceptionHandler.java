package com.aws.demo.exception;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    GlobalExceptionHandler() {

    }



    @ExceptionHandler(CustomerNotFoundCheckedException.class)
    public ResponseEntity<ErrorResponse> handleCustomerNotFoundCheckedException(CustomerNotFoundCheckedException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getLocalizedMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    public ResponseEntity<ErrorResponse> customerDuplicateException(CustomerDuplicateUnCheckedException exception) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT.value(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT.value()).body(errorResponse);
    }
}
