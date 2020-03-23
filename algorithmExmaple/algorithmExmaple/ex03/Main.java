package ex03;

import java.util.Scanner;

public class Main {

	// 문제
	
	// 가장많이 출현한 수를 출력하시오.
	// 배열, for
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[]inputNum = new int[10];
		for(int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int[] mode = new int[10];
		for(int i = 0; i<10; i++) {
			mode[inputNum[i]]++;
		}
		
		int modeNum = 0;
		int modeCnt = 0;
		for(int i = 0; i<10; i++) {
			if(modeCnt<mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는:"+modeNum+", cnt:"+modeCnt);
	}

}
