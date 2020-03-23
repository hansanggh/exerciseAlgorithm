package ex25;

public class Main {

	// 문제
	// 더하기 사이클
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 42;
		int res = n;
		int tmp = 0;
		int cnt = 0;
		
		do {
			
			tmp = res / 10 + res % 10;
			res = res % 10 * 10 + tmp % 10;
			cnt++;
			
		} while(n != res);
		
		System.out.println(cnt);
	
	}

}
