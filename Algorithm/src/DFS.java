import java.util.Scanner;

public class DFS {
	static int vertex; // 정점의 개수
	static int startVertex; // 시작 정점
	static int[][] vertexMap; // 인점 행렬 맵
	static int[] vertexVisit; // 정점의 방문 여부를 가리키는 배열
	static int vt1, vt2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		vertex = sc.nextInt();
		startVertex = Integer.parseInt(sc.nextLine().trim());
		vertexMap = new int[vertex + 1][vertex + 1];
		vertexVisit = new int[vertex + 1];
		
		while(true) {
			vt1 = sc.nextInt();
			vt2 = sc.nextInt();
			
			if (vt1 < 0 && vt2 < 0) { // 두 개의 점이 0보다 작을 경우 break
				break;
			}
			
			vertexMap[vt1][vt2] = vertexMap[vt2][vt1] = 1; // 정점 vt1 과 vt2가 연결되었음을 표기
		}
		
		dfs(startVertex);
	}
	
	public static void dfs(int start) {
		vertexVisit[start] = 1;

		for (int i = 1;i <= vertex;i++) {
			if (vertexMap[start][i] == 1 && vertexVisit[i] == 0) {
				System.out.println(start + " -> " + i + "로 이동합니다.");
				dfs(i);
			}
		}
	}
}
