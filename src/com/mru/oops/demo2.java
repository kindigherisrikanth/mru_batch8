package com.mru.oops;



public class demo2 {
	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		
		obj1.addition();
		
		int res=obj1.subtraction(100, 50);
		System.out.println("Subtraction : "+res);
		
		obj1.multi(100,50);
		
		int result2 = obj1.Division();
		System.out.println("Division : "+result2);
	}
}
