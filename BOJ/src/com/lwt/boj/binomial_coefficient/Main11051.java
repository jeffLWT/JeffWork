package com.lwt.boj.binomial_coefficient;

import java.util.HashMap;
import java.util.Scanner;

public class Main11051 {
	public static final int MOD = 10007;
	public static HashMap<Integer, Integer> map = new HashMap<>();
	public static int[][] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		dp = new int[N + 1][K + 1];
		System.out.println(result(N, K) % MOD);
		sc.close();
	}
	
	private static int result(int n, int k) {
		if (n == k || k == 0) {
			return 1;
		} else if (dp[n][k] > 0) {
			return dp[n][k];
		} else {
			return dp[n][k] = result(n - 1, k - 1) + result(n - 1, k);
		}
	}
}
