package com.register.Register.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String emailIdNotFound) {
        super(emailIdNotFound);

    }
    public ResourceNotFoundException()
    {
        super("resource not found");
    }
}
