package com.bridgeLabs;

import java.util.Scanner;

public class MaxFinder {

	static Integer firstNo;
	static Integer secondNo;
	static Integer thirdNo;
	static Float firstNox;
	static Float secondNoy;
	static Float thirdNoz;
	private static void testMaximum(Float a, Float b, Float c) {
		
		//let max is a 
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

	public static void main(String[] args) {

		getIntUserInput();
		testMaximum(firstNo, secondNo, thirdNo);
		getFloatUserInput();
		testMaximum(firstNox, secondNoy, thirdNoz);
		
	}
		}


