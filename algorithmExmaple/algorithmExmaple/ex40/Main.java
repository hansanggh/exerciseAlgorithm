package ex40;

import java.util.Scanner;

public class Main {

	// ����
	// 1�� ����� ���
	// 3���� ������, 2�� ������, 1���� ����� ������ �ʿ��Ѱ�?
	
	public static int min = 99999999;

	public static void doFunc(int num, int way, int cnt) {
		
		if (way == 3 && num % 3 == 0) {
			cnt++;
			num /= way;
			for (int i = 1; i <= 3; i++)
				doFunc(num, way, cnt);
		} else if (way == 2 && num % 2 == 0) {
			cnt++;
			num /= way;
			for (int i = 1; i <= 3; i++)
				doFunc(num, way, cnt);
		} else if (num >= 2){
			cnt++;
			num -= 1;
			for (int i = 1; i <= 3; i++)
				doFunc(num, way, cnt);
		}
		
		// �ּڰ� ����
		if (num == 1 && cnt < min) {
			min = cnt;
			return;
		}
	}
	
	// �ð������ɸ� �ð� �����Ϸ��� �������α׷�������..
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <=3; i++)
			doFunc(n, i, 0);
		System.out.println(min);
	}

}
