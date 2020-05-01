package com.example.demo.test;

class BaseHRup {

	int findMed(int n1, int n2) {
		return (n1 + n2) / 2;
	}
	String myMessage() {
		return "From Base";
	}
}

class BaseHR extends BaseHRup {
	public static void main(String args[]) {
		
		int $=0;
		System.out.println($);
		BaseHR bhr = new BaseHR();
		int n1 =45;
		int n2 = 43;
		int res = bhr.findMed(n1, n2);
		System.out.println(res);
		
		BaseHRup bup = new BaseHR();
		int a = bup.findMed(n1, n2);
		System.out.println(a);
		
		BaseHRup b = new BaseHRup();
		
		System.out.println(bhr.myMessage());
		System.out.println(bup.myMessage());
		System.out.println(b.myMessage());
		
		
		}
	String myMessage() {
		return "From child";
		
	}
	int add1(int a,int b) {
		return a+b;
	}
}
