package com.serina.staybooking.model;

public record RegisterRequest(
        String username,
        String password,
        UserRole role
) {
}