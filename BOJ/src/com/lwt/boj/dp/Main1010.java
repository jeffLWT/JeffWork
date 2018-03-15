package com.lwt.boj.dp;

import java.util.Scanner;

public class Main1010 {
	public static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while (T > 0) {
			count = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			combination(M, N, 0, count);
			System.out.println(count);
			T--;
		}
		
		sc.close();
	}

	private static void combination(int m, int n, int target, int c) {
		if (n == 0) {
			//System.out.println("n == 0");
			count += 1;
		} else if (m == n) {
			//System.out.println("m == n");
			count += 1;
		} else if (m == target) {
			//System.out.println("m == target");
			return;
		} else {
			//System.out.println("1 m = " + m + " n = " + n + " target = " + target + " count = " + count);
			combination(m, n - 1, target + 1, count + 1);
			//System.out.println("2 m = " + m + " n = " + n + " target = " + target + " count = " + count);
			combination(m, n, target + 1, count + 1);
			//System.out.println("3 m = " + m + " n = " + n + " target = " + target + " count = " + count);
		}
	}
}
