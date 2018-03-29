package com.lwt.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main2504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Stack<Character> stack = new Stack<>();
		int sCnt = 0; // '(' 의 개수
		int mCnt = 0; // '[' 의 개수
		int mul = 1;
		int result = 0;
		
		for (int i = 0;i < input.length();i++) {
			char ch = input.charAt(i);
			
			if (ch == '(') {
				sCnt++;
				stack.push(ch);
				mul *= 2;
				
				if ((i + 1) < input.length() && input.charAt(i + 1) == ')') {
					result += mul;
				}
			} else if (ch == ')') {
				sCnt--;
				stack.pop();
				mul /= 2;
			} else if (ch == '[') {
				mCnt++;
				stack.push(ch);
				mul *= 3;
				
				if ((i + 1) < input.length() && input.charAt(i + 1) == ']') {
					result += mul;
				}
			} else if (ch == ']') {
				mCnt--;
				stack.pop();
				mul /= 3;
			}
		}
		
		if (!stack.isEmpty() || sCnt != 0 || mCnt != 0) {
			System.out.println(0);
		} else {
			System.out.println(result);
		}
		
		sc.close();
	}
}
