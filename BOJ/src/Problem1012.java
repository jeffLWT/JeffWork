import java.util.Scanner;

public class Problem1012 {
	static int M;
	static int N;
	static int K;
	static int[][] map;
	static int[][] visited;
	static int[] move_M = {0, 0, 1, -1};//»óÇÏÁÂ¿ì
	static int[] move_N = {1, -1, 0, 0};//»óÇÏÁÂ¿ì

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int count = 0; // the number of worms
		
		while (T > 0) {
			count = 0;
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			map = new int[M][N];
			visited = new int[M][N];

			for (int i = 0;i < K;i++) {
				int t1 = sc.nextInt();
				int t2 = sc.nextInt();
				map[t1][t2] = 1;
			}
			
			for (int i = 0;i < M;i++) {
				for (int j = 0;j < N;j++) {
					if (visited[i][j] == 0 && map[i][j] == 1) {
						visited[i][j] = 1;
						count++;
						dfs(i, j);
					}
				}
			}
			
			System.out.println("count = " + count);
			T--;
		}
	}
	
	public static void dfs(int _i, int _j) {
		int m = 0;
		int n = 0;
		
		for (int i = 0;i < 4;i++) {
			m = _i + move_M[i];
			n = _j + move_N[i];
			
			if (m < 0 || n <0) {
				continue;
			}

			if (m >=0 && n >= 0 && m < M && n < M && map[m][n] == 1 && visited[m][n] != 1) {
				visited[m][n] = 1;
				System.out.println("visit[" + m + "]" + "[" + n + "]");
				dfs(m, n);
			}
		}
	}
}
