package week3;

import java.util.Scanner;

public class Boj1912 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n,sum=0,sum1=-1000,cnt=0;
		int a[] = new int[100001];
		n = input.nextInt();
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();			
		}
		for(int i=0;i<n;i++) {
			sum = sum + a[i];
			if(sum < sum - a[i])
			{
				if(sum-a[i] > sum1)
					sum1 = sum - a[i];
			}
			if(sum <= 0) {
				sum = 0;
				cnt++;
			}
		}
		if(sum > sum1) sum1 = sum;
		if(cnt == n) sum1 = -1000;
		for(int i=0;i<n;i++) {
			if(a[i] > sum1) sum1 = a[i];
		}
		System.out.println(sum1);

	}

}
