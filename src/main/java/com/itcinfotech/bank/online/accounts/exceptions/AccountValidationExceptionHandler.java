/**
 * 
 */
package com.itcinfotech.bank.online.accounts.exceptions;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



/**
 * @author 34798
 *
 */
@ControllerAdvice
public class AccountValidationExceptionHandler extends ResponseEntityExceptionHandler {

	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		ExceptionResponseStructure exception = new ExceptionResponseStructure("Not a valid request",request.getDescription(false),LocalDateTime.now());
		   return new ResponseEntity(exception, HttpStatus.BAD_REQUEST);
	}
}
