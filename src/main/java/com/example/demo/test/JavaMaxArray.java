/**
 * 
 */
package com.example.demo.test;

/**
 * @author ram
 *
 */
public class JavaMaxArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myNumbers = { 98, 34, 23, 2, 56, 78 };
		int max_no = funcmaxNumber(myNumbers);
		System.out.println(max_no);

	}

	private static int funcmaxNumber(int[] myNumbers) {
		// TODO Auto-generated method stub
		int max_number = myNumbers[0];
		for (int a : myNumbers) {
			if(a > max_number) {
				max_number = a;
			}
		}
		return max_number;
	}

}
