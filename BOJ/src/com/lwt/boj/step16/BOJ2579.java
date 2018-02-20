package com.lwt.boj.step16;

import java.util.Scanner;

public class BOJ2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		int[] a = new int[n + 1];
		
		for (int i = 1;i <= n;i++) {
			a[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 1;i <= n;i++) {
			if (i == 1) {
				d[1] = a[1];
			} else if (i == 2) {
				d[2] = Max(a[2], a[1] + a[2]);
			} else {
				d[i] = Max((a[i - 1] + a[i] + d[i - 3]), a[i] + d[i - 2]);
			}
		}
		
		System.out.println(d[n]);
	}
	
	static int Max(int a, int b) {
		return (a > b) ? a : b;
	}
}
