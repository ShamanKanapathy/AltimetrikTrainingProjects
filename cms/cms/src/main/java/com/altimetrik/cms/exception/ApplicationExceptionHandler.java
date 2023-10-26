package com.altimetrik.cms.exception;

import com.altimetrik.cms.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ApplicationExceptionHandler {
    @ExceptionHandler(NoSuchMethodException.class)
    public void handleNoSuchException(Exception ex){
        ResponseEntity<?> error=new ResponseEntity<>("Customerid not found", HttpStatus.NOT_FOUND);


    }

}
