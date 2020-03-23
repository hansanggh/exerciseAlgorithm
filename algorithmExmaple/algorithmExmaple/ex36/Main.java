package ex36;

import java.util.Scanner;

public class Main {

	// 문제
	// 이진수 변환 재귀
	
	public static void decToBin(int N) {
		// 2로 나누었을때 몫이 0이면 탈출!
		if (N/2 == 0) {
			System.out.print(N);
			return;
		}
		decToBin(N/2);
		System.out.print(N%2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		decToBin(input);
	}
}
