package com.RapidGrow.common.exceptions.handlers;

public class UserException extends RuntimeException{
    private String message;

    public UserException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "User exception message";
    }
}
