package com.example.excercise.exception;

public class BadInputCredentialException extends RuntimeException {
    
    /**
     * Initializes a new instance of the AuthenticationException class with a specified error message.
     *
     * @param message The error message that describes the reason for the exception.
     */
    public BadInputCredentialException(String message) {
        super(message);
    } 

}
