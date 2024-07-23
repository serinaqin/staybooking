package com.serina.staybooking.booking;

public class DeleteBookingNotAllowedException extends RuntimeException {
    public DeleteBookingNotAllowedException(long guestId, long bookingId) {
        super("Guest " + guestId + " is not allowed to delete booking " + bookingId);
    }
}
