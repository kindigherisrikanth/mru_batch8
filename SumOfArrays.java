package com.mru.faqs;


	
	public class SumOfArrays {
	    public static void main(String[] args) {
	        // Example array
	        int[] arr = {1, 2, 3, 4};

	        // Variable to store the sum
	        int sum = 0;

	        // Loop through the array and add each element to the sum
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }

	        // Output the sum
	        System.out.println("The sum of the array elements is: " + sum);
	    }
	}