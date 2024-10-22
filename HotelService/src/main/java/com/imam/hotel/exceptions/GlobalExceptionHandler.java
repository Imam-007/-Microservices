package com.imam.hotel.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GlobalExceptionHandler {

    public ResponseEntity<Map<String, Object>> notFoundHandler(ResourceNotFoundException exception){

        Map map=new HashMap<>();
        map.put("message",exception.getMessage());
        map.put("success",false);
        map.put("status", HttpStatus.NOT_FOUND);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }
}
