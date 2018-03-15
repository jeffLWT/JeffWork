package com.lwt.boj.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Using O(NlogN) Algorithm
 */
public class Main11053_algorithm2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		
		for (int i = 1;i <= N;i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println(getLISLength(A, N));
		sc.close();
	}

	private static int getLISLength(int[] arr, int size) {
		int length = 0;
		int[] list = new int[size];
		list[0] = arr[1];
		length = 1;
		
		for (int i = 2;i <= size;i++) {
			if (arr[i] < list[0]) { // �Էµ� ���� list �� index = 0 ������ ���� ���
				list[0] = arr[i];
			} else if (list[length - 1] < arr[i]) { // �Էµ� ���� list�� ������ ������ Ŭ ���
				list[length] = arr[i];
				length++;
			} else { // �Էµ� ���� list �� �ִ� ��� index ã�� ������Ʈ
				int index = Arrays.binarySearch(arr, 0, length, arr[i]);
				index = (index < 0) ? -index - 1 : index;
				list[index] = arr[i];
			}
		}
		
		return length;
	}
}
