package com.selimhorri.pack.exception.wrapper;

public class StudentNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public StudentNotFoundException() {
		
	}
	
	public StudentNotFoundException(final String msg) {
		super(msg);
	}
	
	public StudentNotFoundException(final Throwable throwable) {
		super(throwable);
	}
	
	public StudentNotFoundException(final String msg, final Throwable throwable) {
		super(msg, throwable);
	}
	
}







