package com.saitheja.Splitwise.exception;

public class UserRegistrationInvalidDataException extends Exception{
    public UserRegistrationInvalidDataException() {
    }

    public UserRegistrationInvalidDataException(String message) {
        super(message);
    }

    public UserRegistrationInvalidDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserRegistrationInvalidDataException(Throwable cause) {
        super(cause);
    }

    public UserRegistrationInvalidDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
