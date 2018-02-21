package com.lwt.boj.step16;

import java.util.Scanner;

public class BOJ10844 {
	public static final int MOD = 1000000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int[][] dp = new int[N + 1][11];
		long result = 0;
		
		for (int i = 1;i < 10;i++) {
			dp[1][i] = 1;
		}

		for (int j = 2;j <= N;j++) {
			for (int i = 1;i <= 9;i++) {
				dp[j][0] = dp[j - 1][1];
				dp[j][i] = (dp[j - 1][i - 1] + dp[j - 1][i + 1]) % MOD;
			}
		}
		
		for (int i = 0;i < 10;i++) {
			result += dp[N][i];
		}

		System.out.println(result % MOD);
	}
}
