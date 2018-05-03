package com.lwt.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main11403 {
	public static int N;
	public static int[][] map;
	public static int[][] result;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N + 1][N + 1];
		result = new int[N + 1][N + 1];
		
		for (int i = 1;i <= N;i++) {
			for (int j = 1;j <= N;j++) {
				map[i][j] = sc.nextInt();
			}
		}

		bfs();
		printOutput();
		sc.close();
	}

	private static void bfs() {
		// TODO Auto-generated method stub
		for (int i = 1;i <= N;i++) {
			boolean[] visited = new boolean[N + 1];
			Queue<Integer> queue = new LinkedList<>();
			queue.add(i);
			
			while (!queue.isEmpty()) {
				int start = queue.poll();
				
				for (int j = 1;j <= N;j++) {
					if (map[start][j] == 1 && visited[j] == false) {
						visited[j] = true;
						queue.add(j);
						//System.out.println("result i = " + i + " j = " + j);
						result[i][j] = 1;
					}
				}
			}
		}
	}

	private static void printOutput() {
		for (int i = 1;i <= N;i++) {
			for (int j = 1;j <= N;j++) {
				System.out.print(result[i][j] + " ");
			}
			
			System.out.println("");
		}
	}

	
}
