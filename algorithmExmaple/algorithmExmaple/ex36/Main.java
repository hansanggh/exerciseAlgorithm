package ex36;

import java.util.Scanner;

public class Main {

	// ����
	// ������ ��ȯ ���
	
	public static void decToBin(int N) {
		// 2�� ���������� ���� 0�̸� Ż��!
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
