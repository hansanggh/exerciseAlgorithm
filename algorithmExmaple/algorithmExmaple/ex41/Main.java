package ex41;

import java.util.Scanner;

public class Main {

	// 문제
	// 1로 만들기 동적프로그래밍
	
	static int[] ans = new int[1000001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ans[2] = 1;
		ans[3] = 1;
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 4; i <= 1000000; i++) {
			// 맥시멈값
			int a = 99999, b = 99999, c = 99999;
			for (int w = 1; w <= 3; w++) {
				if (w == 1) {
					a = ans[i - 1];
				} else if (w == 2) {
					if (i % 2 == 0) {
						b = ans[i / 2];
					}
				} else if (w == 3) {
					if (i % 3 == 0) {
						c = ans[i / 3];
					}
				}
			}
			int min = min(a, b, c);
			ans[i] = 1 + min;
		}
		System.out.println(ans[input]);
	}

	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c)
				return a;
			else
				return c;
		} else {
			if (b < c)
				return b;
			else
				return c;
		}
	}

}
