package ex35;

import java.util.Scanner;

public class Main {

	// 문제
	// 숫자추출 재귀
	// 입력된 수를 높은 자리부터 출력
	
	public static void extract(int N) {
		
		if (N/10 == 0) {
			System.out.println(N);
			return;
		}

		extract(N/10); 
		System.out.println(N%10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		extract(input);
	}

}
