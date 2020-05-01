package com.example.demo.test;

import java.util.Scanner;

public class RecFunc2 {

	public static void main(String[] args) {
		System.out.print("Enter Your number:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try {
			int mt = Integer.parseInt(input);
			int addRec = numberAddRecursion(mt);
			System.out.println("Addition by Rsecursion:" + addRec);
			int addIte = numberAddIteration(mt); 
			System.out.println("Addition by Iteration:" + addIte);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		sc.close();
	}

	private static int numberAddRecursion(int mt) {
		if (mt == 1) {
			return 1;
		} else {
			return (mt + numberAddRecursion(mt - 1));
		}

	}
	private static int numberAddIteration(int mt) {
		int add =0;
		while(mt >0) {
			add = add+mt--;
		}
		return add;
	}

}
