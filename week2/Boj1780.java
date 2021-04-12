package week2;

import java.util.Scanner;

public class Boj1780 {
	public static int a[][] = new int[2187][2187];
	public static int paper[] = new int[3];
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
		System.out.println(paper[0]);
		System.out.println(paper[1]);
		System.out.println(paper[2]);
	}
	public static void cheak(int row_s, int col_s, int n) {
		int sum=0;
		boolean ch=true;
		if(n == 1) {
			if(a[row_s][col_s] == 0)
				paper[1]++;
			else if(a[row_s][col_s] == -1)
				paper[0]++;
			else
				paper[2]++;
			return;
		}
		for(int i=row_s;i<row_s+n;i++) {
			for(int j=col_s;j<col_s+n;j++) {
				if(a[i][j] != a[row_s][col_s])
					ch = false;
			}
		}
		if(!ch) {
			cheak(row_s,col_s,n/3);
			cheak(row_s,col_s+(n/3),n/3);
			cheak(row_s,col_s+2*(n/3),n/3);
			cheak(row_s+n/3,col_s,n/3);
			cheak(row_s+n/3,col_s+(n/3),n/3);
			cheak(row_s+n/3,col_s+2*(n/3),n/3);
			cheak(row_s+2*(n/3),col_s,n/3);
			cheak(row_s+2*(n/3),col_s+(n/3),n/3);
			cheak(row_s+2*(n/3),col_s+2*(n/3),n/3);
		}
		else {
			paper[a[row_s][col_s]+1]++;
		}
	}


}
