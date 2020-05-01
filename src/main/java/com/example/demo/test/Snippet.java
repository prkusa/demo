package com.example.demo.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Snippet {
	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
		data.add("MI");
		data.add("TX");
		data.add("NJ");
		data.add("NY");
		data.add("OH");
		data.add("MI");
		for(String s : data) {
			System.out.println(s);
		}
		System.out.println("***");
		Set<String> data_unique = new LinkedHashSet<String>(data);
		for(String s : data_unique) {
			System.out.println(s);
		}
	}
}

