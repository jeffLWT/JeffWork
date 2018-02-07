import java.util.Scanner;

public class Problem1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double before = 0.0;
		double after = 0.0;
		before = System.currentTimeMillis();
		
		for (int i = 0;i < T;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = 0;
			int remainedValue = 0;
			
			if (a == 1) {
				result = 1;
			} else {
				int number = 0;

				if (b > getRemainNumber(a, b)) {
					remainedValue = b % getRemainNumber(a, b);
				} else {
					remainedValue = b;
				}
				
				number = (int)Math.pow(a, remainedValue);
				result = (int)(number % 10);
			}
			
			System.out.println(result);
		}
		
		after = System.currentTimeMillis();
		System.out.println("time = " + (after - before));
	}
	
	public static int getRemainNumber(int a, int b) {
		int remained = 0;
		int mok = a;
		int count = 0;

		for (int i = 1;i < (b + 1);i++) {
			mok = (int)Math.pow(a, i);
			remained = mok % 10;
			count++;
			
			if (remained == 1) {
				break;
			}
		}

		return count;
	}
}
