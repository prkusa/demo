package com.example.demo.test;

import java.util.Scanner;
import java.util.Stack;

public class TestParenthesis {

	public static void main(String[] args) {
		System.out.print("Enter ParenthesisExpression:");
		Scanner sc = new Scanner(System.in);
		String sc_str =  sc.next();
        while(!sc_str.matches("[\\(\\{\\[\\]\\}\\)]+"))
        {
        	try 
        	{
        		throw new MyStringException("Not Allowed Here - Please enter Parenthesis only",sc_str);
        	}
        	catch(MyStringException mse)
        	{
        		System.out.println(mse.getMessage()+":"+mse.getStackTrace());
        	}
        	System.out.print("Enter ParenthesisExpression:");
        	sc_str =  sc.next();
        }
	//	String exp = "{[(]}";
		
        String exp = "";
		exp = sc_str;
		sc.close();
		
		boolean validity = funcparenthesisValid(exp);
		System.out.println("resut:" + validity);
	}

	private static boolean funcparenthesisValid(String exp) {

		boolean valid = false;

		Stack<Character> datastack = new Stack<Character>();

		char[] myData = exp.toCharArray();

		for (int i = 0; i < myData.length; i++) 
		{
			if (myData[i] == '[' || myData[i] == '{' || myData[i] == '(') 
			{
				datastack.push(myData[i]);
			}
			if (myData[i] == ']' || myData[i] == '}' || myData[i] == ')') 
			{
				char topData = datastack.peek();
				if (topData == '[' && myData[i] == ']' || topData == '{' && myData[i] == '}'|| topData == '(' && myData[i] == ')') 
				{
					datastack.pop();
				} 
				else 
				{
					return valid;
				}
			}
		}

		if (datastack.empty()) {
			valid = true;
			return valid;
		} else {
			return valid;
		}

	}

}
