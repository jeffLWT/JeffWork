package com.lwt.boj.dp;

import java.util.Scanner;

public class Main1010 {
	public static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] dp;
		
		while (T > 0) {
			count = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			dp = new int[N + 1][M + 1];
			
			for (int i = 1;i <= M;i++) {
				dp[1][i] = i;
			}
			
			for (int i = 2;i <= N;i++) {
				for (int j = i;j <= M;j++) {
					if (i == j) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
					}
				}
			}
			
			System.out.println(dp[N][M]);
			T--;
		}
		
		sc.close();
	}
}
