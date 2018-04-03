package com.lwt.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main6549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}
			
			
			long[] h = new long[n + 1];
			
			for (int i = 0;i < n;i++) {
				h[i] = sc.nextLong();
			}
			
			Stack<Integer> stack = new Stack<>();
			stack.push(0);
			long result = Long.MIN_VALUE;

			for (int i = 1;i < n;i++) {
				int left = 0;
				int right = 0;
				long scale = 0;

				while (!stack.isEmpty() && h[stack.peek()] > h[i]) {
					int heightIndex = stack.pop();
					right = i - 1;

					if (!stack.isEmpty()) {
						left = stack.peek();
					} else {
						left = -1;
					}
					
					scale = h[heightIndex] * (right - left);

					if (result < scale) {
						result = scale;
					}
				}
				
				stack.push(i);
			}
			
			while (!stack.isEmpty()) {
				long scale = 0;
				int heightIndex = stack.pop();
				int right = n - 1;
				int left = 0;
				
				if (stack.isEmpty()) {
					left = -1;
				} else {
					left = stack.peek();
				}
				
				scale = h[heightIndex] * (right - left);
				
				if (result < scale) {
					result = scale;
				}
			}
			
			System.out.println(result);
		}
		
		sc.close();
	}
}
