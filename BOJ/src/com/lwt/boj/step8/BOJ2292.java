package com.lwt.boj.step8;
import java.util.Scanner;

public class BOJ2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int sum = 1;
		int result = 0;
		
		while (true) {
			if (N == 1) {
				break;
			}

			sum += 6 * count;
			
			if (N > sum) {
				count++;
			} else {
				count++;
				break;
			}
		}
		
		System.out.println(count);
	}
}
