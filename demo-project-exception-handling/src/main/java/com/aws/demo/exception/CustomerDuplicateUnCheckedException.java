package com.aws.demo.exception;

public class CustomerDuplicateUnCheckedException extends RuntimeException {
    CustomerDuplicateUnCheckedException(String message) {
        super(message);
    }

    CustomerDuplicateUnCheckedException(Throwable throwable) {
        super(throwable);
    }

    CustomerDuplicateUnCheckedException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
