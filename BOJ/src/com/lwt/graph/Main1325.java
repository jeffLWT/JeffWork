package com.lwt.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1325 {
	public static int N;
	public static int M;
	public static ArrayList<Integer>[] map = new ArrayList[100001];
	public static int mCount = Integer.MIN_VALUE;
	public static boolean[] visited;
	public static int[] save = new int[10001];
	public static int size = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		for (int i = 1;i <= N;i++) {
			map[i] = new ArrayList<>();
		}
		
		
		for (int i = 0;i < M;i++) {
			int end = sc.nextInt();
			int start = sc.nextInt();
			map[start].add(end);
		}
		
		for (int i = 1;i <= N;i++) {
			visited = new boolean[N + 1];
			bfs(i);
		}

		for (int i = 0;i < size;i++) {
			System.out.print(save[i] + " ");
		}
		
		sc.close();
	}

	private static void bfs(int a) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.add(a);
		int count = 0;
		visited[a] = true;
		count++;
		
		while (!queue.isEmpty()) {
			int start = queue.poll();
			
			for (int i = 0;i < map[start].size();i++) {
				int temp = map[start].get(i);

				if (!visited[temp]) {
					visited[temp] = true;
					queue.add(temp);
					count++;
					//System.out.println("start = " + start + " end = " + temp + " count = " + count);
				}
			}
		}
		
		if (mCount < count) {
			mCount = count;
			size = 0;
			save[size++] = a;
		} else if (mCount == count) {
			save[size++] = a;
		}
	}
}
