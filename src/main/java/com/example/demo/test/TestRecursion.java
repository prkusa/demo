/**
 * 
 */
package com.example.demo.test;

/**
 * @author ram
 *
 */
public class TestRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printNumbers(3);

	}
	public static void printNumbers(int i) {
		 if(i>0) {
			 printNumbers(i-1);
			 System.out.println(i);
		 }
	}

}
