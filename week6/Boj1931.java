package week6;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Boj1931 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[][] time = new int[N][2];
		for (int i = 0; i < N; i++) {
			time[i][0] = input.nextInt(); // 시작시간
			time[i][1] = input.nextInt(); // 종료시간
		}
		// 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		int count = 0;
		int prev_e = 0;
		for (int i = 0; i < N; i++) {
			if (prev_e <= time[i][0]) {
				prev_e = time[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}