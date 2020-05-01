package com.example.java8;

public class MyException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String msg = "";
	public MyException(String msg) {
		super(msg);
		this.msg = msg;

	}

}
