package ex39;

import java.util.Scanner;

public class Main {

	// 문제
	// 1,2,3 더하기로 숫자 표현하기
	
	static int cache[] = new int[1000];
	
	//규칙성찾기 중요(점화식)
	public static int doFunc(int n) {
		if (cache[n] != 0) {
			return cache[n];
		}
		
		return cache[n] = doFunc(n-1) + doFunc(n-2) + doFunc(n-3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		cache[1] = 1;
		cache[2] = 2;
		cache[3] = 4;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println(doFunc(n));
	}

}
