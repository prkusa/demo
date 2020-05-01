package com.example.java8;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Numbers:");
		int nos=0;
		try {
			 nos = sc.nextInt();
		}
		catch(MyException e) {
			System.out.println(e.toString());
		}
		int []nosent = new int[nos];
		
		for( int a =0;a < nosent.length;a++)
		{
			System.out.println("Enter Number:");
			nosent[a] = sc.nextInt();
		}
		
		for(int b = 0;b < nosent.length;b++)
		{
			System.out.println(nosent[b]);
		}

	}

}
