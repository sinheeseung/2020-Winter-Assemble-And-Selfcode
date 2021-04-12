package week2;

import java.util.Scanner;

public class Boj2630 {
	public static int blue=0, white=0;
	public static int a[][] = new int[128][128];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = input.nextInt();
			}
		}
		cheak(0,0,n);
		System.out.println(white);
		System.out.println(blue);

	}
	private static void cheak(int row_s,int col_s,int n) {
		int sum=0;
		if(n == 0) {
			if(a[row_s][col_s] == 1)
				blue++;
			else white++;
			return;
		}
		for(int i=row_s;i<row_s+n;i++) {
			for(int j=col_s;j<col_s+n;j++) {
				sum = sum + a[i][j];
			}
		}
		if(sum == n*n)
			blue++;
		else if(sum == 0)
			white++;
		else {
			cheak(row_s,col_s,n/2);
			cheak(row_s+n/2,col_s,n/2);
			cheak(row_s,col_s+n/2,n/2);
			cheak(row_s+n/2,col_s+n/2,n/2);
		}

	}

}
