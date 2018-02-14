package com.lwt.boj.step8;
import java.util.Scanner;

public class BOJ2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String out = "*";
		
		for (int i = 0;i < N;i++) {
			System.out.println(out);
			out += "*";
		}
	}
}
