package week3;

import java.util.Scanner;
public class Boj1463 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		int a[] = new int[n+1];
		a[1] = 0;
		for(int i=2;i<=n;i++) {
			a[i] = a[i-1]+1;
			if(i % 2 == 0)
				a[i] = Math.min(a[i/2]+1, a[i]);
			if(i % 3 == 0)
				a[i] = Math.min(a[i/3]+1, a[i]);
			
		}
		System.out.println(a[n]);
		
	}

}
