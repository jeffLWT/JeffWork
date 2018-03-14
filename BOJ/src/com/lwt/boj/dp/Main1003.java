package com.lwt.boj.dp;

import java.util.HashMap;
import java.util.Scanner;

public class Main1003 {
	public static int mCountZero = 0;
	public static int mCountOne = 0;
	public static HashMap<Integer, Integer> valueMap = new HashMap<>();
	public static HashMap<Integer, Data> map = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while (T > 0) {
			int N = sc.nextInt();
			mCountZero = 0;
			mCountOne = 0;
			fibonacci(N);
			System.out.println(mCountZero + " " + mCountOne);
			T--;
		}
		
		sc.close();
	}
	
	private static int fibonacci(int n) {
		if (valueMap.containsKey(n)) {
			Data data = map.get(n);
			int tempZero = data.countZero;
			int tempOne = data.countOne;
			mCountZero += tempZero;
			mCountOne += tempOne;
			//System.out.println("Memoization Zero : " + mCountZero + " One : " + mCountOne);
			return valueMap.get(n);
		} else if (n == 0) {
			mCountZero++;
			return 0;
		} else if (n == 1) {
			mCountOne++;
			return 0;
		} else {
			int result = fibonacci(n - 1) + fibonacci(n - 2);
			valueMap.put(n, result);
			map.put(n, new Data(mCountZero, mCountOne));
			return result;
		}
	}
	
	public static class Data {
		int countZero = 0;
		int countOne = 0;
		
		public Data(int countZero, int countOne) {
			this.countZero = countZero;
			this.countOne = countOne;
		}
	}
}
