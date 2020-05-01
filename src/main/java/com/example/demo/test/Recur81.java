package com.example.demo.test;

public class Recur81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =2;
		int y =1;
         int res = func1( x, y);
         System.out.println(res);
			
		
	}
	
	public static int func1(int x,int y) {
		
		if(x ==0) {
			return y;
		}
		else {
		return  func1(x-1,y+1);
		}
	}

}
