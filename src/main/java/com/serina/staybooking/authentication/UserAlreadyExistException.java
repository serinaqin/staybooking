package com.serina.staybooking.authentication;

public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException() {
        super("Username already exists");
    }
}

