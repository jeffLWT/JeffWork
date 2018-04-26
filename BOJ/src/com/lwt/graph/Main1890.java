package com.lwt.graph;

import java.util.Scanner;

public class Main1890 {
	public static int N;
	public static int[][] map = new int[101][101]; // Index 는 1부터 시작
	public static long[][] dp = new long[101][101];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for (int i = 1;i <= N;i++) {
			for (int j = 1;j <= N;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		dp[1][1] = 1;
		
		for (int i = 1;i <=N;i++) {
			for (int j = 1;j <= N;j++) {
				int value = map[i][j];
				
				if (j != N && j + value < (N  + 1)) {
					dp[i][j + value] += dp[i][j];
				}
				
				if (i != N && i + value < (N + 1)) {
					dp[i + value][j] += dp[i][j];
				}
			}
		}
		
		System.out.println(dp[N][N]);
		sc.close();
	}
}
