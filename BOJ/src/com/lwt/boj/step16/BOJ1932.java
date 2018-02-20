package com.lwt.boj.step16;

import java.util.Scanner;

public class BOJ1932 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n + 1][n + 1];
		int[][] d = new int[n + 1][n + 1];

		for (int i = 1;i <= n;i++) {
			for (int j = 1;j <= i;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1;i <= n;i++) {
			for (int j = 1;j <= i;j++) {
				if (j == 1) {
					d[i][1] = a[i][1] + d[i -1][1];
				} else if (j == i) {
					d[i][j] = a[i][j] + d[i - 1][j - 1];
				} else {
					d[i][j] = a[i][j] + Max(d[i - 1][j - 1], d[i - 1][j]);
				}
			}
		}
		
		int max = 0;
		
		for (int i = 1;i <= n;i++) {
			if (max <= d[n][i]) {
				max = d[n][i];
			}
		}
		
		System.out.println(max);
	}
	
	static int Max(int a, int b) {
		return (a > b) ? a : b;
	}
}
