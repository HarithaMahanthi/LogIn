package com.example.excercise.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	ResponseEntity<String> handleUserNotFound(UserNotFoundException ex){
		return ResponseEntity.status(404).body(ex.getMessage());
		
	}
	
	@ExceptionHandler(AuthenticationException.class)
	ResponseEntity<String> handleAuthException(AuthenticationException ex){
		return ResponseEntity.status(401).body(ex.getMessage());
	}
	
	@ExceptionHandler(DuplicateUserException.class)
	ResponseEntity<String> duplicateException(DuplicateUserException ex){
		 return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
	}
	

	@ExceptionHandler(BadInputCredentialException.class)
	ResponseEntity<String> duplicateException(BadInputCredentialException ex){
		 return ResponseEntity.status(400).body(ex.getMessage());
	}

}
