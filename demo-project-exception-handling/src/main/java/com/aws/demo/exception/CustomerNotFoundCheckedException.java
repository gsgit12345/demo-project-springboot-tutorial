package com.aws.demo.exception;

public class CustomerNotFoundCheckedException extends  Exception{

    CustomerNotFoundCheckedException(String message)
    {
        super(message);
    }
    CustomerNotFoundCheckedException(String message,Throwable throwable)
    {
        super(message,throwable);
    }
    CustomerNotFoundCheckedException(Throwable throwable)
    {
        super(throwable);
    }
}
