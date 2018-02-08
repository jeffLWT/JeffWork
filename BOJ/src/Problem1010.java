import java.util.Scanner;

public class Problem1010 {
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr;
		
		for (int i = 0;i < T;i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			arr = new int[M];
			count = 0;
			
			if (M == N) {
				System.out.println(1);
			}
			
			combination(arr, 0, M, N, 0);
			System.out.println(count);
		}
	}
	
	static void combination(int[] arr, int index, int n, int r, int target) {
		if (r == 0) {
			count++;
		} else if (target == n) {
			return;
		} else {
			arr[index] = target;
			combination(arr, index + 1, n, r - 1, target + 1);
			combination(arr, index, n, r, target + 1);
		}
	}
}
