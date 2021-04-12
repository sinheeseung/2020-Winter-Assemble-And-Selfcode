package week4;

import java.util.Scanner;

public class Boj11055 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n, sum, sum1;
		n = input.nextInt();
		int dp[] = new int[n + 1];
		int arr[] = new int[n + 1];
		for (int i = 0; i < n; i++)
			arr[i] = input.nextInt();
		dp[0] = arr[0];
		sum = dp[0];
		for (int i = 1; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] > arr[j]) {
					if (dp[i]-arr[i] < dp[j])
						dp[i] = dp[j] + arr[i];
				}
			}
			if (dp[i] < arr[i])
				dp[i] = arr[i];

			if (dp[i] > sum)
				sum = dp[i];
		}
		System.out.println(sum);

	}

}
