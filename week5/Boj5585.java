package week5;

import java.util.Scanner;
public class Boj5585 {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n = input.nextInt();
		n = 1000 - n;
		boolean change = true;
		int cnt=0, chan=500;
		while(n > 0) {
			if(n >= chan) {
				cnt = cnt + n / chan;
				n = n % chan;
			}
			if(change) {
				chan = chan / 5;
				change = false;
			}
			else {
				chan = chan / 2;
				change = true;
			}
		}
		System.out.println(cnt);
	}


}
