package com.imam.user.service.exceptions;

import com.imam.user.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException  exception){

       String message= exception.getMessage();
       ApiResponse apiResponse=new ApiResponse();

       apiResponse.setMessage(message);
       apiResponse.setSuccess(true);
       apiResponse.setStatus(HttpStatus.NOT_FOUND);

       return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
    }
}
