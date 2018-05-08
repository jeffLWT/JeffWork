package com.lwt.graph;

import java.util.Scanner;

public class Main1987 {
	public static int R;
	public static int C;
	public static boolean[] visited = new boolean[26];
	public static int[][] map;
	public static int mResult = Integer.MIN_VALUE;
	public static int[] moveR = {0, -1, 0, 1};
	public static int[] moveC = {-1, 0, 1, 0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		map = new int[R + 1][C + 1];
		
		for (int i = 1;i <= R;i++) {
			String input = sc.next();
			
			for (int j = 1;j <= C;j++) {
				map[i][j] = input.charAt(j - 1) - 'A';
			}
		}
		
		dfs(1, 1, 1);
		System.out.println(mResult);
		sc.close();
	}

	private static void dfs(int r, int c, int count) {
		// TODO Auto-generated method stub
		visited[map[r][c]] = true;
		mResult = Math.max(mResult, count);
		
		for (int i =0;i < 4;i++) {
			int newR = r + moveR[i];
			int newC = c + moveC[i];
			
			if (!isInRange(newR, newC)) {
				continue;
			}
			
			if (visited[map[newR][newC]]) {
				continue;
			}
			
			visited[map[newR][newC]] = true;
			System.out.println("dfs newR = " + newR + " newC = " + newC + " Result = " + mResult + " Count = " + count);
			dfs(newR, newC, count + 1);
			visited[map[newR][newC]] = false;
		}
	}

	private static boolean isInRange(int newR, int newC) {
		// TODO Auto-generated method stub
		return (newR >= 1 && newR <= R) && (newC >= 1 && newC <= C);
	}
}
