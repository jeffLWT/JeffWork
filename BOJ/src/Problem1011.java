import java.util.ArrayList;
import java.util.Scanner;

public class Problem1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int D = 0;
		ArrayList<Long> result = new ArrayList<>();
		
		for (int i = 0;i < T;i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			D = Y - X;
			result.add(warp(D));
		}
		
		for (int i = 0;i < result.size();i++) {
			System.out.println(result.get(i));
		}
	}
	
	static long warp(int dist) {
		long n, minN, powN, maxN, warpCount = 0L;
		
		for (n = 1;;n++) {
			powN = n * n;
			minN = powN - n + 1;
			maxN = powN + 1 + n - 1;
			
			if (minN <= dist && dist <= maxN) {
				if (minN <= dist && dist <= powN) {
					warpCount = (n << 1) -1;
				} else {
					warpCount = n << 1;
				}
				
				break;
			}
		}
		
		return warpCount;
	}
}
