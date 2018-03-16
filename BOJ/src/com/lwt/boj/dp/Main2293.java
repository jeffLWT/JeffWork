package com.lwt.boj.dp;

import java.util.Scanner;

public class Main2293 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] coin = new int[N + 1];
		int[][] dp = new int[N + 1][K + 1];
		dp[0][0] = 1;
		
		for (int i = 1;i <= N;i++) {
			coin[i] = sc.nextInt();
			dp[i][0] = 1;
		}
		
		for (int i = 1;i <= N;i++) {
			for (int j = 1;j <= K;j++) {
				if (coin[i] > j) dp[i][j] = dp[i - 1][j];
				else dp[i][j] = dp[i - 1][j] + dp[i][j - coin[i]];
			}
		}
		
		System.out.println(dp[N][K]);
		sc.close();
	}
}
