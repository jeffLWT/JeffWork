package com.lwt.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1697 {
	public static int N;
	public static int K;
	public static int time = 0;
	public static boolean[] visited = new boolean[100001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		// bfs
		bfs(N);
		System.out.println(time);
		sc.close();
	}

	private static void bfs(int position) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.add(position);
		visited[position] = true;
		
		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0;i < size;i++) {
				int _position = queue.poll();
				//System.out.println("current position : " + _position);

				if (_position == K) {
					return;
				}
				
				if ((_position - 1) >= 0 && (_position - 1) <= 100000 && visited[_position - 1] == false) {
					//System.out.println("dec position : " + (_position - 1));
					queue.add((_position - 1));
					visited[_position - 1] = true;
				}
				
				if ((_position + 1) >= 0 && (_position + 1) <= 100000 && visited[_position + 1] == false) {
					//System.out.println("inc position : " + (_position + 1));
					queue.add((_position + 1));
					visited[_position + 1] = true;
				}
				
				if ((_position * 2) >= 0 && (_position  * 2) <= 100000 && visited[_position  * 2] == false) {
					//System.out.println("mul position : " + (_position  * 2));
					queue.add((_position  * 2));
					visited[_position  * 2] = true;
				}
			}
			
			time++;
		}
	}
}
