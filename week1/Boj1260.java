package week1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1260 {

	static int[][] graph;
	static boolean visited[];
	static int N;
	static int E;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		graph = new int[1001][1001];
		E = input.nextInt();
		visited = new boolean[10001];
		int start = input.nextInt();

		int a, b;

		for (int i = 1; i <= E; i++) {
			a = input.nextInt();
			b = input.nextInt();

			graph[a][b] = graph[b][a] = 1;
		}

		dfs(start);

		System.out.println();

		for (int i = 1; i <= N; i++) {
			visited[i] = false;
		}
		bfs(start);
	}
	
	public static void dfs(int n) {
		visited[n] = true;
		System.out.print(n + " ");

		for (int j = 1; j <= N; j++) {
			if (graph[n][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}
	}

	public static void bfs(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		visited[n] = true;
		System.out.print(n + " ");

		int temp;
		while (!q.isEmpty()) {
			temp = q.poll();
			for (int j = 0; j < N + 1; j++) {
				if (graph[temp][j] == 1 && visited[j] == false) {
					q.offer(j);
					visited[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}

}
