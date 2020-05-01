package com.example.demo.test;

public class AllStringComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String myString = "abc";
        String myAllstrings = func1(myString);
        System.out.println(myAllstrings);
	}
	public static String func1(String str) {
		
		char temp;
		char fixed;
		char c1;
		char c2;
		StringBuffer sb = new StringBuffer();
	    for(int i =0;i<str.length();i++) {
	    	sb.append(str.charAt(i));
	    }
	    
		for(int a =0;a < str.length(); a++ ) {
			sb.append('-');
			fixed = str.charAt(a);
			sb.append(fixed);
			temp = str.charAt(a+1);
			c1 = str.charAt(a+2);
			sb.append(c1);
			sb.append(temp);
			
		}
		
		
		return sb.toString();
	}

}
