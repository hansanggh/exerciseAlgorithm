package ex30;

import java.util.Scanner;

public class Main {

	// 문제
	// 입력된 숫자까지 더하기 빼기 반복하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int until;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		until = scan.nextInt();
		
		for (int i =1; i <= until; i++) {
			if (i == until) {
				System.out.println(i);
				break;
			}			
			if (flag) {
				System.out.print(i+"+");
				flag = !flag;
			}
			else {
				System.out.print(i+"-");
				flag = !flag;
			}		
		}
	}

}
