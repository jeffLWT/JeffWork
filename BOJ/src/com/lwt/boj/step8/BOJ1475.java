package com.lwt.boj.step8;

import java.util.Scanner;

public class BOJ1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = String.valueOf(N);
		sc.close();
		int i = 0;
		int set[] = new int[10];
		int max = 0;
		input = input.replace('9', '6');
		
		for (i = 0;i < input.length();i++) {
			int index = input.charAt(i) - 48;
			set[index]++;
		}
		
		set[6] = set[6] / 2 + set[6] % 2;
		
		for (i = 0;i < 9;i++) {
			if (max < set[i]) {
				max = set[i];
			}
		}
		
		System.out.println(max);
	}

}
