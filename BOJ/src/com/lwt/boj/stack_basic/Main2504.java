package com.lwt.boj.stack_basic;

import java.util.LinkedList;
import java.util.Scanner;

public class Main2504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		LinkedList<Character> queue = new LinkedList<>();
		int mul = 1;
		int ans = 0;
		int sIndex = 0; // ( ) Index
		int mIndex = 0; // [ ] Index
		
		for (int i = 0;i < input.length();i++) {
			char ch = input.charAt(i);
			
			if (ch == '(') {
				queue.push(ch);
				mul *= 2;
				sIndex++;

				if ((i + 1) < input.length() && input.charAt(i + 1) == ')') {
					ans += mul;
				}
			} else if (ch == '[') {
				queue.push(ch);
				mul *= 3;
				mIndex++;

				if ((i + 1) < input.length() && input.charAt(i + 1) == ']') {
					ans += mul;
				}
			} else if (ch == ')') {
				queue.poll();
				mul /= 2;
				sIndex--;
			} else if (ch == ']') {
				queue.poll();
				mul /= 3;
				mIndex--;
			}
		}
		
		//System.out.println("sIndex = " + sIndex + " mIndex = " + mIndex);
		
		if (!queue.isEmpty() || sIndex > 0 || mIndex > 0) {
			System.out.println(0);
		} else {
			System.out.println(ans);
		}
	}
}
