package com.serina.staybooking.model;

public record LoginRequest(
        String username,
        String password
) {
}
