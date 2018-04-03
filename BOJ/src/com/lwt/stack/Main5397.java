package com.lwt.stack;

import java.util.Scanner;

public class Main5397 {
	public static int T;
	public static char[] leftStack;
	public static char[] rightStack;
	public static int leftStackSize;
	public static int rightStackSize;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		while (T > 0) {
			leftStack = new char[1000001];
			rightStack = new char[1000001];
			leftStackSize = 0;
			rightStackSize = 0;
			String input = sc.next();
			
			for (char c : input.toCharArray()) {
				if (c == '<') {
					if (leftStackSize > 0) {
						push_right(pop_left());
					}
				} else if (c == '>') {
					if (rightStackSize > 0) {
						push_left(pop_right());
					}
				} else if (c == '-') {
					if (leftStackSize > 0)
						pop_left();
				} else {
					push_left(c);
				}
			}
			
			printPassword();
			T--;
		}
		
		sc.close();
	}
	
	private static void push_left(char a) {
		leftStack[leftStackSize++] = a;
	}
	
	private static void push_right(char a) {
		rightStack[rightStackSize++] = a;
	}

	private static char pop_left() {
		return leftStack[--leftStackSize];
	}
	
	private static char pop_right() {
		return rightStack[--rightStackSize];
	}
	
	
	private static void printPassword() {
		for (int i = 0;i < leftStackSize;i++) {
			System.out.print(leftStack[i]);
		}
		
		for (int i = rightStackSize - 1;i >= 0;i--) {
			System.out.print(rightStack[i]);
		}
		
		System.out.println("");
	}
}
