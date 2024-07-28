package com.serina.staybooking.location;

public class GeocodingException extends RuntimeException {
    public GeocodingException() {
        super("Failed to look up address");
    }
}
