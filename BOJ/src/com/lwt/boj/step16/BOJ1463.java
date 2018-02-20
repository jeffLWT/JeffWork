package com.lwt.boj.step16;

import java.util.Scanner;

public class BOJ1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 1 <= X 10^6
		int[] d = new int[N + 1];
		sc.close();
		
		for (int i = 2;i <= N;i++) {
			int temp = i;
			int a = 0, b = 0, c = 0;

			if (temp % 3 == 0) {
				a = temp / 3;
			}
			if (temp % 2 == 0) {
				b = temp / 2;
			}

			c = temp - 1;

			if (a != 0) {
				if (b != 0 && c != 0) {
					d[i] = 1 + Min(Min(d[a], d[b]), d[c]);
				} else {
					if (b != 0) {
						d[i] = 1 + Min(d[a], d[b]);
					} else {
						d[i] = 1 + Min(d[a], d[c]);
					}
				}
			} else {
				if (b != 0) {
					d[i] = 1 + Min(d[b], d[c]);
				} else {
					d[i] = 1 + d[c];
				}
			}
		}
		
		System.out.println(d[N]);
	}
	
	static int Min(int a, int b) {
		return (a < b) ? a : b;
	}
}
