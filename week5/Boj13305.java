package week5;

import java.util.Scanner;
public class Boj13305 {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n = input.nextInt();
		long city[] = new long[n+1];
		long dis[] = new long[n];
		long sum=0,val;
		for(int i=0;i<n-1;i++) {
			dis[i] = input.nextInt();
		}
		for(int i=0;i<n;i++) {
			city[i] = input.nextInt();
		}
		val = city[0];
		for(int i=0;i<n-1;i++) {
			if(val < city[i+1])
				sum = sum + val * dis[i];
			else {
				sum = sum + val * dis[i];
		        val = city[i+1];
			}
		}
		System.out.println(sum);
	}


}
