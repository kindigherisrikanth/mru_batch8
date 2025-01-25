package com.mru.faqs;

public class NumberReverse {

	public static void main(String[] args) {
		int num = 124;
		int rev=0;
		 
		while (num!=0) {
			int last = num%10;
			rev = rev*10 + last;
			num = num/10;
		}
		System.out.println("Reverse number: "+rev);
	}

}