package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookExceptionalHandler {
    @ExceptionHandler
    public ResponseEntity<BookErrorResponse> handleException(BookNotFoundException exc)
    {

        BookErrorResponse error=new BookErrorResponse(
                HttpStatus.NOT_FOUND.value(),exc.getMessage(),System.currentTimeMillis());


        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<BookErrorResponse> handleException(Exception exc)
    {

        BookErrorResponse error=new BookErrorResponse(
                HttpStatus.BAD_REQUEST.value(),exc.getMessage(),System.currentTimeMillis());


        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
