package com.lwt.boj.step16;

import java.util.Scanner;

public class BOJ2965 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		int left = Math.abs(A - B);
		int right = Math.abs(B - C);
		int result = 0;
		int temp = B;

		if (left < right) {
			result = C - temp - 1; 
		} else {
			result = temp - A - 1;
		}
		
		System.out.println(result);
	}
}
