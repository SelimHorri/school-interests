package com.selimhorri.pack.exceptions.wrappers;

public class SchoolNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public SchoolNotFoundException() {
		
	}
	
	public SchoolNotFoundException(final String msg) {
		super(msg);
	}
	
	public SchoolNotFoundException(final Throwable throwable) {
		super(throwable);
	}
	
	public SchoolNotFoundException(final String msg, final Throwable throwable) {
		super(msg, throwable);
	}
	
	
	
}





