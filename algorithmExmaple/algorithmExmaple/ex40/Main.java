package ex40;

import java.util.Scanner;

public class Main {

	// 문제
	// 1로 만들기 재귀
	// 3으로 나누기, 2로 나누기, 1빼기 몇번의 연산이 필요한가?
	
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
		
		// 최솟값 갱신
		if (num == 1 && cnt < min) {
			min = cnt;
			return;
		}
	}
	
	// 시간오래걸림 시간 단축하려면 동적프로그래밍으로..
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
