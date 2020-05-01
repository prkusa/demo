package com.example.demo.test;

public class JavaRec {

	public static void main(String[] args) {
		
		  int count =0;
			p( count);
		
        
	}

	private static void p( int count) {
		// TODO Auto-generated method stub
		System.out.print("in method p before-");
		
		System.out.println(count++);
		p(count);
	
		System.out.println("in method p after");
	}

	private static void p1() {
		// TODO Auto-generated method stub
		System.out.println("in method p1");
	}
	

}
