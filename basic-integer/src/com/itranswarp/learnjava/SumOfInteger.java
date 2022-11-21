package com.itranswarp.learnjava;

/**
 * Sum of integers.
 */
public class SumOfInteger {

	public static void main(String[] args) {
		int n = 100;
		// TODO: sum = 1 + 2 + ... + n
		int sum = 1;
		for(int i =1;i<=n;i++) {
			sum = sum + i;
		}
		System.out.println("SumOfInteger"+ ":" +sum);
	}

}
