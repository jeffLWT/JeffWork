package com.lwt.boj.step8;

import java.util.Scanner;

public class BOJ1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int sum = 0;
		int previous = 0;
		int index = 0;
		
		for (int i = 0;i < X;i++) {
			previous = sum;
			sum += (i + 1);
			
			if (sum >= X) {
				index = (i + 1);
				break;
			}
		}

		int fractionalNumber = index + 1;
		int denominator = 0;
		int numerator = 0;
		int xCount = X - previous;

		if (index % 2 != 0) {
			numerator = fractionalNumber - xCount; 
			denominator = xCount;
		} else {
			numerator = xCount;
			denominator = fractionalNumber - xCount;
		}
		
		System.out.println(numerator + "/" + denominator);
	}
}
