package com.lwt.boj.step8;

import java.util.Scanner;

public class BOJ1924 {
	public static void main(String[] args) {
		int[] month_list = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day_list = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int sumOfDay = 0;
		
		for (int i = 0;i < x;i++) {
			sumOfDay += month_list[i];
		}
		
		sumOfDay += y;
		int index = sumOfDay % 7;
		
		if (index == 0) {
			System.out.println(day_list[6]);
		} else {
			System.out.println(day_list[index - 1]);
		}
	}
}
