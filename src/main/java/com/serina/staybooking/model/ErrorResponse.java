package com.serina.staybooking.model;

public record ErrorResponse(
        String message,
        String error
) {
}
