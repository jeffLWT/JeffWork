package com.lwt.boj.dp;

import java.util.Scanner;

/**
 * LIS 문제를 O(N^2), O(NlogN) 알고리즘으로 각각 다시 풀어 보기
 */

public class Main11053_Algorithm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		int[] dp = new int[N + 1];
		
		for (int i = 1;i <= N;i++) {
			A[i] = sc.nextInt();
		}
		
		for (int i = 1;i <= N;i++) {
			int count = 0;
			
			for (int j = 0;j < i;j++) {
				if (A[i] > A[j]) {
					count = Math.max(count, dp[j]);
				}
			}
			
			dp[i] = count + 1;
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 1;i <= N;i++) {
			if (max < dp[i]) {
				max = dp[i];
			}
		}
		
		System.out.println(max);
		sc.close();
	}
}
