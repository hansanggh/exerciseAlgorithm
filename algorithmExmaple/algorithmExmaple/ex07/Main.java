package ex07;

public class Main {

	// 문제
	// 입력한 수 가 소수인지 판별
	// 반복문(while, for), if
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		
		boolean isPrimeNumber = true;
		
		for(int i = 2; i<=num/2; i++) {
			if(num%i==0) {
				isPrimeNumber=false;
			}
			
		}
		if(isPrimeNumber) {
			System.out.println(num + " 은 소수입니다.");
		}
		else {
			System.out.println(num+" 은 소수가 아닙니다.");
		}
	}

}
