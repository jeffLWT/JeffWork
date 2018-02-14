package com.lwt.boj.step8;

import java.util.Scanner;

public class BOJ2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0;i < T;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int result = 0;
			
			for (int j = 1;j <= n;j++) {
				result += getNumber((k - 1), j);
			}
			
			System.out.println(result);
		}
		sc.close();
	}
	
	static int getNumber(int _k, int _n) {
		if (_k == 0) {
			return _n;
		} else if (_n == 1) {
			return 1;
		} else {
			_k--;
			int value = 0;

			for (int i = 0;i < _n;i++) {
				value += getNumber(_k, _n - i);
			}

			return value;
		}
	}
}
