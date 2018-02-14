package com.lwt.boj.step8;

import java.util.Scanner;

public class BOJ10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0;i < T;i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int numberOfRoom = 0;
			int index = 0;
			int roomIndex = 0;
			int roomNumber = 0;
			
			for (int j = 0;j < W;j++) {
				numberOfRoom += H;

				if (N >= (numberOfRoom - (H - 1)) && N <= numberOfRoom) {
					index = j;
					break;
				}
			}
			
			roomIndex = N - (H * index);
			roomNumber = (100 * roomIndex) + (index + 1);
			System.out.println(roomNumber);
		}

		sc.close();
	}
}
