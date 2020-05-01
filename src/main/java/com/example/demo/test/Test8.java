/**
 * 
 */
package com.example.demo.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author ram
 *
 */
public class Test8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> lm = new HashMap<String, Integer>();
		lm.put("MI", 1);
		lm.put("TX", 2);
		lm.put("NJ", 3);
		
		Iterator<?> it = lm.entrySet().iterator();
		while (it.hasNext()) {
			
		Map.Entry<String,Integer> m = (Map.Entry<String,Integer>)it.next();
		System.out.println(m.getKey()+":"+m.getValue());
        it.remove();
        break;
		}
       System.out.println(lm);
	}

}
