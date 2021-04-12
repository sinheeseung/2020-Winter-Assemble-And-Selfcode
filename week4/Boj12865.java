package week4;

import java.util.Scanner;
public class Boj12865 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int arr[][] = new int [101][2];
		int dp[] []= new int[n+1][k+1];
		for(int i=0;i<n;i++) {
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
		}
		for(int i=0;i<=n;i++) {
			for(int w=0;w<=k;w++) {
				if(i == 0 || w == 0)
					dp[i][w] = 0;
				else if(arr[i-1][0] <= w)
					dp[i][w] = Math.max(arr[i-1][1] + dp[i-1][w-arr[i-1][0]], dp[i-1][w]);
				else
					dp[i][w] = dp[i-1][w];
			}
		}
		System.out.println(dp[n][k]);
	}


}
