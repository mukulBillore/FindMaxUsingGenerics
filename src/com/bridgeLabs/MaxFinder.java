package com.bridgeLabs;

import java.util.Scanner;

public class MaxFinder {

	static Integer firstNo;
	static Integer secondNo;
	static Integer thirdNo;

	public static void testMaximum(Integer a, Integer b, Integer c) {
		//let max is a 
		Integer max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println(max + " is maximum number");
	}

	public static void getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number one");
		firstNo = sc.nextInt();
		System.out.println("Enter Number two");
		secondNo = sc.nextInt();
		System.out.println("Enter Number three");
		thirdNo = sc.nextInt();
	}

	public static void main(String[] args) {

		getUserInput();
		testMaximum(firstNo, secondNo, thirdNo);

	}

}
