package com.bridgeLabs;

import java.util.Scanner;

public class MaxFinder<T extends Comparable<T>> {

	T first;
	T second;
	T third;

	public MaxFinder(T first, T second, T third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public void maxFun(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println(max + " is maximum String");
	}

	public static void main(String args[]) {
		MaxFinder obj = new MaxFinder(12, 23, 24);
		obj.maxFun(obj.first, obj.second, obj.third);
	}
}