import java.awt.Point;
import java.util.Scanner;

public class Problem1007 {
	public static double min = Double.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Point[] p;
		int[] pArray;
		
		for (int i = 0;i < T;i++) {
			int N = sc.nextInt();
			p = new Point[N];
			pArray = new int[N];
			min = Double.MAX_VALUE;
			
			for (int j = 0;j < N;j++) {
				p[j] = new Point(sc.nextInt(), sc.nextInt());
			}

			combination(pArray, 0, N, (N / 2), 0, p);
			double d = Math.round(min * 1000000d) / 1000000d;
			System.out.println(String.format("%.6f", d));
		}
	}
	
	public static void combination(int[] array, int index, int n, int r, int target, Point[] p) {
		if (r == 0) {
			// min °ª Ãâ·Â
			min(array, index, p);
		} else if (target == n) {
			return;
		} else {
			array[index] = target;
			combination(array, index + 1, n, r - 1, target + 1, p);
			combination(array, index, n, r, target + 1, p);
		}
	}
	
	public static void min(int[] arr, int length, Point[] p) {
		double sumX = 0.0;
		double sumY = 0.0;
		double vectorSum = 0.0;
		
		for (int i = 0;i < p.length;i++) {
			sumX += p[i].x;
			sumY += p[i].y;
		}
		
		for (int i = 0;i < length;i++) {
			sumX -= p[arr[i]].x * 2;
			sumY -= p[arr[i]].y * 2;
		}

		vectorSum = Math.sqrt((sumX * sumX) + (sumY * sumY));
		
		if (min > vectorSum) {
			min = vectorSum;
		}
	}
}
