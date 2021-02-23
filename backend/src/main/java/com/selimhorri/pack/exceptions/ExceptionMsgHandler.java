package com.selimhorri.pack.exceptions;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.selimhorri.pack.exceptions.payloads.ExceptionMsgPayload;
import com.selimhorri.pack.exceptions.wrappers.SchoolNotFoundException;
import com.selimhorri.pack.exceptions.wrappers.StudentNotFoundException;

@ControllerAdvice
public class ExceptionMsgHandler {
	
	@ExceptionHandler(
		value = {
			StudentNotFoundException.class,
			SchoolNotFoundException.class
		}
	)
	public <T extends RuntimeException> ResponseEntity<ExceptionMsgPayload> handleCustomException(final T exception) {
		
		final HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		final ExceptionMsgPayload exceptionMsgPayload = new ExceptionMsgPayload(
			exception.getMessage(),
			exception,
			badRequest,
			ZonedDateTime.now(ZoneId.systemDefault())
		);
		
		System.err.println(exception);
		
		return new ResponseEntity<>(exceptionMsgPayload, badRequest);
	}
	
	
	
}








