package com.imam.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String hotelNotFound) {
        super(hotelNotFound);
    }

    public ResourceNotFoundException(){
        super("Resource not found!!!");
    }
}
