package com.lwt.search;

import java.util.Scanner;

public class Main11729 {
	public static int N;
	public static int mCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		System.out.println((int)(Math.pow(2, N) - 1));
		solve(N, 1, 3);
		sc.close();
	}

	private static void solve(int n, int from, int to) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}
		
		solve(n - 1, from, 6 - from - to); // (N - 1)���� 1��°���� 2��°�� �ű�� ����
		System.out.println(from + " " + to);
		solve(n - 1, 6 - from - to, to); // (N - 1)���� 2��°���� 3��°�� �ű�� ����
	}
}
