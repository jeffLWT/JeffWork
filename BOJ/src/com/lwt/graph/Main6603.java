package com.lwt.graph;

import java.util.Scanner;

public class Main6603 {
	public static int K;
	public static int[] S;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			K = sc.nextInt();
			
			if (K == 0) {
				break;
			}
			
			S = new int[K];
			
			for (int i = 0;i < K;i++) {
				S[i] = sc.nextInt();
			}
			
			int[] arr = new int[K];
			combination(arr, 0, K, 6, 0);
			System.out.println("");
		}
		
		sc.close();
	}

	private static void combination(int[] arr, int index, int n, int r, int target) {
		// TODO Auto-generated method stub
		if (r == 0) {
			// 결과 출력
			printResult(arr, index);
		} else if (target == n) {
			return;
		} else {
			arr[index] = S[target];
			combination(arr, index + 1, n, r - 1, target + 1);
			combination(arr, index, n, r, target + 1);
		}
	}

	private static void printResult(int[] arr, int length) {
		for (int i = 0;i < length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
	}
}
