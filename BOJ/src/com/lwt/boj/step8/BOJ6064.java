package com.lwt.boj.step8;

import java.util.Scanner;

public class BOJ6064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0;i < T;i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int count = 0;
			int result = 0;
			int temp = 0;
			int minimumBaesu = 0;
			
			if (M >= N) {
				temp = M / N;
			} else {
				temp = N / M;
			}

			minimumBaesu = temp * (M / temp) * (N / temp);
			
			while (true) {
				result = x + M * count;
				
				if (result > minimumBaesu) {
					result = -1;
					break;
				}
				
				int index = result % N;
				
				if (index == 0) {
					index = N;
				}
				
				if (index == y) {
					break;
				}
				
				count++;
			}
			
			System.out.println(result);
		}
	}
}
