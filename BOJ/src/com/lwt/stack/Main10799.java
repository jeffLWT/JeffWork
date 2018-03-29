package com.lwt.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Stack<Character> stack = new Stack<>();
		int result = 0;

		for (int i = 0;i < input.length();i++) { // O(N)
			if (input.charAt(i) == '(') {
				stack.push(input.charAt(i));
			} else if (input.charAt(i) == ')') {
				stack.pop();

				if (input.charAt(i - 1) == '(') { // 레이저
					result += stack.size();
				} else { // 막대기의 끝부분
					result++;
				}
			}
		}

		System.out.println(result);
		sc.close();
	}
}
