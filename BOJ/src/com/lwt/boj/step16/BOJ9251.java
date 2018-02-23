package com.lwt.boj.step16;

import java.util.Scanner;

public class BOJ9251 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		int length1 = str1.length();
		int length2 = str2.length();
		int[][] dp = new int[length1 + 1][length2 + 1];
		
		for (int i = 1;i <= length2;i++) {
			char ch1 = str1.charAt(i - 1);
			
			for (int j = 1;j <= length1;j++) {
				char ch2 = str2.charAt(j - 1);
				
				if (ch1 == ch2) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		
		System.out.println(dp[length1][length2]);
	}

	private static int Max(int i, int j) {
		return (i > j) ? i : j;
	}
}
