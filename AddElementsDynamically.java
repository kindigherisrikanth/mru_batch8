package com.mru.faqs;
import java.util.Scanner;
public class AddElementsDynamically {

	public static void main(String[] args) {
		System.out.println("Enter array length: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter array length for "+i+"th positionn: ");
			arr[i] = scanner.nextInt();
		}
		
		//display array
		for(int element:arr) {
			System.out.println(element+" ");

		}
	}
}
