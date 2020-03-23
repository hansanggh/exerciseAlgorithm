package ex19;

public class Main {

	// 문제
	// 거듭제곱
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int m =3;
		
		// 초기화를 1로하는 이유 기억!
		int res = 1;
		
		for(int i=0; i<m; i++) {
			res*=n;
		}
		System.out.println(res);
	}

}
