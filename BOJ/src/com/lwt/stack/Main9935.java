package com.lwt.stack;

import java.util.Scanner;

public class Main9935 {
	public static int stackIdx = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String bomb = sc.next();
		char[] stack = new char[1000001];

		for (int i = 0;i < input.length();i++) {
			//System.out.println("input stackIdx = " + stackIdx);
			stack[stackIdx++] = input.charAt(i);
			
			if (input.charAt(i) == bomb.charAt(bomb.length() - 1)) {
				// bomb 글자와 완전히 같은 히 확인 후 stack 정리
				checkBomb(stack, bomb);
			}
		}
		
		if (stackIdx == 0) {
			System.out.println("FRULA");
		} else {
			for (int i = 0;i < stackIdx;i++) {
				System.out.print(stack[i]);
			}
		}
		
		sc.close();
	}

	private static void checkBomb(char[] stack, String bomb) {
		if (stackIdx < bomb.length()) {
			return;
		}

		boolean isMatched = true;
		int index = 0;

		for (int i = bomb.length() - 1;i >=0;i--) {
			//System.out.println("index = " + index + " bomb index = " + i);
			
			if (stack[stackIdx - 1 - index] != bomb.charAt(i)) {
				isMatched = false;
				break;
			}

			index++;
		}
		
		//System.out.println("isMatched = " + isMatched);
		
		if (isMatched) {
			stackIdx = stackIdx - bomb.length();
		}
	}
}
