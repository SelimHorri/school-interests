package com.selimhorri.pack.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.selimhorri.pack.exception.payload.ExceptionMsgPayload;
import com.selimhorri.pack.exception.wrapper.SchoolNotFoundException;
import com.selimhorri.pack.exception.wrapper.StudentNotFoundException;

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








