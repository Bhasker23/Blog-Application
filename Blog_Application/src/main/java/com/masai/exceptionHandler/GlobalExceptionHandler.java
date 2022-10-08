package com.masai.exceptionHandler;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.masai.exceptionClasses.ErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> parentException(Exception exception , WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		
		er.setMessage(exception.getMessage());
		er.setDescription(wr.getDescription(false));
		er.setDate(LocalDate.now());
		
		return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
		
		
	}
	
}
