package ex09;

public class Main {

	// 문제
	// 각 자릿수의 합 구하기
	// 반복문(for, while)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNum = 1232;
		int accSum = 0;
		
		while(inputNum>0) {
			accSum += inputNum %10;
			inputNum /= 10;
		}
		
		System.out.println(accSum);
	}

}
