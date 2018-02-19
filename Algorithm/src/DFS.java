import java.util.Scanner;

public class DFS {
	static int vertex; // ������ ����
	static int startVertex; // ���� ����
	static int[][] vertexMap; // ���� ��� ��
	static int[] vertexVisit; // ������ �湮 ���θ� ����Ű�� �迭
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
			
			if (vt1 < 0 && vt2 < 0) { // �� ���� ���� 0���� ���� ��� break
				break;
			}
			
			vertexMap[vt1][vt2] = vertexMap[vt2][vt1] = 1; // ���� vt1 �� vt2�� ����Ǿ����� ǥ��
		}
		
		dfs(startVertex);
	}
	
	public static void dfs(int start) {
		vertexVisit[start] = 1;

		for (int i = 1;i <= vertex;i++) {
			if (vertexMap[start][i] == 1 && vertexVisit[i] == 0) {
				System.out.println(start + " -> " + i + "�� �̵��մϴ�.");
				dfs(i);
			}
		}
	}
}
