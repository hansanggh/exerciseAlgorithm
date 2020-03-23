package ex08;

public class Main {

	// 문제
	// 입력된 수의 팩토리얼을 구하시오
	// 반복문(for, while)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNum = 5;
		int accNum = 1;
		
		for(int i = 1; i<=inputNum; i++) {
			accNum*= i;
		}
		
		System.out.println(accNum);
	}

}
