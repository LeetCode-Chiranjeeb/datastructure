package com.datastructure.recursion;

public class FibonacciSeries {
	
	//0 1 1 2 3 5 8 13 21

	public static void main(String[] args) {
		
		 int fib_len = 9;

		    System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");

		    for (int i = 0; i < fib_len; i++) 
		      System.out.print(generateFibonacciSeries(i) + " ");

	}
	
	private static  int generateFibonacciSeries(int startNo) {
		if (startNo == 0) {
			return 0;
		}
		
		if (startNo == 1 || startNo == 2) {
			return 1;
		}
		
		
		return generateFibonacciSeries(startNo - 1) + generateFibonacciSeries(startNo - 2);
	}

}
