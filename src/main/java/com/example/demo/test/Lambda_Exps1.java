/**
 * 
 */
package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ram
 *
 */

interface Interf {
	public void callHR();
}

public class Lambda_Exps1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities = new ArrayList<String>();
		cities.add("NewYork");
		cities.add("Hyderabad");
		cities.add("Vizag");
       
		 cities.forEach((n) ->System.out.println(n));
      
	}

}
