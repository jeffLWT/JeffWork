package com.lwt.boj.step14;

import java.util.HashMap;
import java.util.Scanner;

public class BOJ2747 {
	public static HashMap<Integer, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(fibonacci(n));
	}
	
	static int fibonacci(int n) {
		if (map.containsKey(n)) {
			return map.get(n);
		} else if (n == 0) {
			return 0;
		} else if (n <= 2) {
			return 1;
		} else {
			int value = fibonacci(n - 1) + fibonacci(n - 2);
			map.put(n, value);
			return value;
		}
	}
}
