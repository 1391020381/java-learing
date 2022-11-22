package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(tax(2000, 0.1));
		System.out.println(tax(-200, 0.1));
		System.out.println(tax(2000, -0.1));
	}

	static double tax(int salary, double rate) throws IllegalArgumentException {
		// TODO: 如果传入的参数为负，则抛出IllegalArgumentException
		if(salary<0 || rate<0) {
			throw new IllegalArgumentException("Argument is Illegal");
		}else {
			return salary * rate;
		}
		
	}
}
