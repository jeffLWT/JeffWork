package com.lwt.boj.step16;

import java.util.Scanner;

public class BOJ2293 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] cost = new int[N];
		
		for (int i = 0;i < N;i++) {
			cost[i] = sc.nextInt();
		}
		
		sc.close();
		int[] dp = new int[K + 1];
		dp[0] = 1;
		
		for (int i = 0;i < N;i++) {
			for (int j = 1;j <= K;j++) {
				if (cost[i] <= j) {
					dp[j] += dp[j - cost[i]];
				}
				System.out.println("dp[" + j + "] = " + dp[j]);
			}
		}
		
		System.out.println(dp[K]);
	}
}
