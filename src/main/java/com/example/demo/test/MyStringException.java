package com.example.demo.test;

public class MyStringException extends Exception {

	/*
	 * public MyStringException() { // TODO Auto-generated constructor stub }
	 * 
	 * public MyStringException(String arg0) { super(arg0); // TODO Auto-generated
	 * constructor stub
	 * 
	 * }
	 * 
	 * public MyStringException(Throwable cause) { super(cause); // TODO
	 * Auto-generated constructor stub }
	 */

	public MyStringException(String message, String cause) {
		super(message, new Throwable());
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return String.format("MyStringException");
	}

	
}
