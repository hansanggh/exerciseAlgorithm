package ex31;

import java.util.Scanner;

public class Main {

	// 문제
	// 재귀함수 팩토리얼
	public static int calFact(int i) {
		// 재귀함수는 탈출조건이 중요!
		if (i == 1 ) {
			return 1;
		}
		return i * calFact(i-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		int ans = 0;
		
		ans = calFact(input);
		
		System.out.println(ans);
	}

}
