package com.selimhorri.pack.exception.payload;

import java.io.Serializable;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public final class ExceptionMsgPayload implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final String msg;
	private Throwable throwable;
	private final HttpStatus httpStatus;
	private final ZonedDateTime timestamp;
	
	public ExceptionMsgPayload(final String msg, final HttpStatus httpStatus, final ZonedDateTime timestamp) {
		this.msg = msg;
		this.httpStatus = httpStatus;
		this.timestamp = timestamp;
	}
	
	public ExceptionMsgPayload(final String msg, final Throwable throwable, final HttpStatus httpStatus, final ZonedDateTime timestamp) {
		this.msg = msg;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return "ExceptionMsgPayload [msg=" + msg + ", throwable=" + throwable + ", httpStatus=" + httpStatus + ", timestamp=" + timestamp + "]";
	}
	
	public String getMsg() {
		return msg;
	}
	
	public Throwable getThrowable() {
		return throwable;
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}
	
	
	
}









