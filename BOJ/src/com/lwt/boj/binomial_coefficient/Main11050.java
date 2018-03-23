package com.lwt.boj.binomial_coefficient;

import java.util.Scanner;

public class Main11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		System.out.println(binomial_coefficient(N, K));
		sc.close();
	}
	
	private static int binomial_coefficient(int n, int k) {
		if (k == 0) {
			return 1;
		} else if (k == n) {
			return 1;
		} else {
			return binomial_coefficient(n - 1, k - 1) + binomial_coefficient(n - 1, k);
		}
	}
}
