package com.bridgeLabs;

import java.util.Scanner;

public class MaxFinder {
	static String firstString;
	static String secondString;
	static String thirdString;

	static Integer firstNo;
	static Integer secondNo;
	static Integer thirdNo;
	static Float firstNox;
	static Float secondNoy;
	static Float thirdNoz;

// max finders 
	private static void testMaximum(String a, String b, String c) {
		// TODO Auto-generated method stub
		String max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println(max + " is maximum String");
	}

	private static void testMaximum(Float a, Float b, Float c) {

		// let max is a
		Float max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println(max + " is maximum number");
	}

	public static void testMaximum(Integer a, Integer b, Integer c) {
		// let max is a
		Integer max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println(max + " is maximum number");
	}

	// inputs
	public static void getStringUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String one");
		firstString = sc.nextLine();
		System.out.println("EnterString two");
		secondString = sc.nextLine();
		System.out.println("Enter String three");
		thirdString = sc.nextLine();
	}

	public static void getFloatUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number one");
		firstNox = sc.nextFloat();
		System.out.println("Enter Number two");
		secondNoy = sc.nextFloat();
		System.out.println("Enter Number three");
		thirdNoz = sc.nextFloat();
	}

	public static void getIntUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number one");
		firstNo = sc.nextInt();
		System.out.println("Enter Number two");
		secondNo = sc.nextInt();
		System.out.println("Enter Number three");
		thirdNo = sc.nextInt();
	}

	// main fun
	public static void main(String[] args) {

		getIntUserInput();
		testMaximum(firstNo, secondNo, thirdNo);
		getFloatUserInput();
		testMaximum(firstNox, secondNoy, thirdNoz);
		getStringUserInput();
		testMaximum(firstString, secondString, thirdString);

	}

}
