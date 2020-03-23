package ex28;

public class Main {

	// 문제
	// 10진수를 2~16진수로 변환하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char n[] = new char[100];
		// char 배열을 쓰는이유
		int num = 200;
		int jinsu = 8;
		
		int i = 0;
		while (num > 0) {
			int tmp = num % jinsu;
			
			if (tmp >= 10 && tmp <=15) {
				n[i] = (char) ('A' + (tmp-10));
			}
			else {
				n[i] = (char) ('0'+tmp); // 숫자 -> 문자
			}
			num /= jinsu;
			i++;
		}
		
		for ( ; i>=0 ; i--) {
			System.out.print(n[i]);
		}
	}

}
