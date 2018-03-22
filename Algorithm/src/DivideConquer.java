import java.util.Scanner;

public class DivideConquer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int E = sc.nextInt();
		System.out.println(power(N, E));
		sc.close();
	}

	private static int power(int n, int e) {
		if (e == 1) {
			return n;
		} else if (e == 0) {
			return 1;
		} else {
			if (e % 2 == 0) {
				int _n = power(n, e / 2);
				return _n * _n;
			} else {
				int _n = power(n, (e - 1) / 2);
				return _n * _n * n;
			}
		}
	}
}
