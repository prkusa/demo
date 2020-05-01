package com.example.java8;

public class Test1 {

	public static void main(String[] args) {
		int nos =3;
		int sum = printme(nos);
		System.out.println(sum);
	}

	private static int printme(int nos) {
		//write base condition
		if( nos <= 1) {
			return 1;
		}
		// work to be done by recursion
		else {
			return nos+printme(nos-1);
		}
	}

}
