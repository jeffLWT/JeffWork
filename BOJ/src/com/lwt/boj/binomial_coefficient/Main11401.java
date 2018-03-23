package com.lwt.boj.binomial_coefficient;

import java.util.Scanner;

public class Main11401 {
	public static final long P = 1000000007;
	public static long[] fac = new long[4000001];
	public static long[] inverse = new long[4000001];
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		// Factorial 값 배열에 저장
		fac[0] = 1;
		fac[1] = 1;

		for (int i = 2;i < fac.length;i++) {
			fac[i] = (i * fac[i - 1]) % P;
			//System.out.println("fac[" + i + "] = " + fac[i]);
		}

		// Inverse Factorial 구하기 : 페로마의 소정리를 이용하여 구하기
		inverse[4000000] = power(fac[4000000], P -2);

		// 1/(n - 1)! = n * (1 / n!) 공식을 이용하여 inverse factorial 을 쉽게 구함
		for (int i = 4000000 - 1 ;i >= 0;i--) {
			inverse[i] = ((i + 1) * inverse[i + 1]) % P;
		}

		long result = ((fac[N] * inverse[K]) % P * inverse[N - K]) % P;
		System.out.println(result);
		
		sc.close();
	}
	
	// 분할정복을 이용하여 거듭제곱값 구하기
	private static long power(long n, long e) {
		long ret = 1;
	    while (e > 0) {
	        if (e % 2 != 0) {
	            ret *= n;
	            ret %= P;
	        }
	        n *= n;
	        n %= P;
	        e /= 2;
	    }
	    return ret;
	}
}
