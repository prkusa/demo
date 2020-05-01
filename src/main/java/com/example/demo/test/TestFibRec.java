/**
 * 
 */
package com.example.demo.test;

/**
 * @author ram
 *
 */
public class TestFibRec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a =fibSeries(3);
		System.out.println(a);

	}

	public static int fibSeries(int i) {

		if (i == 0) {
			return 0;
		} else if (i == 1 || i == 2) {
			return 1;
		} else 
				return fibSeries(i-1)+fibSeries(i-2);
		
	}

}
