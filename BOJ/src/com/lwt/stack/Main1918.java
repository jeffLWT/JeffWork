package com.lwt.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main1918 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();

		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (int i = 0;i < s.length;i++) {
			//System.out.println("input = " + ch[i]);
			char ch = s[i];
			int p = priority(ch);

			switch (ch) {
	           case '+':
	           case '-':
	           case '*':
	           case '/':
	               while (!stack.isEmpty() && priority(stack.peek()) >= p) {
	                   sb.append(stack.pop());
	               }
	               stack.push(ch);
	               break;
	           case '(':
	               stack.push(ch);
	               break;
	           case ')':
	               while (!stack.isEmpty() && stack.peek() != '(') {
	                   sb.append(stack.pop());
	               }
	               stack.pop();
	               break;
	           default:
	        	   sb.append(ch);
			}
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		System.out.println(sb.toString());
		sc.close();
	}
	
	private static int priority(char c) {
		if (c == '*' || c == '/') {
			return 2;
		} else if (c == '+' || c == '-') {
			return 1;
		} else {
			return 0;
		}
	}
}
