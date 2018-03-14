package com.lwt.boj.dp;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Fibonacci ¼ö¿­ dp
 */

public class Main11726 {
	public static int[] dp;
	public static HashMap<Integer, Integer> map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[1001];
		dp[1] = 1;
		dp[2] = 2;
		map = new HashMap<>();
		System.out.println(next(n));
		sc.close();
	}
	
	private static int next(int _n) {
		if (map.containsKey(_n)) {
			return map.get(_n); // Memoization
		} else if (_n == 1) {
			return 1;
		} else if (_n == 2) {
			return 2;
		} else {
			dp[_n] = (next(_n - 1) + next(_n - 2)) % 10007;
			map.put(_n, dp[_n]);
			return dp[_n];	
		}
	}
}
