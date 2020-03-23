package ex10;

public class Main {

	// 문제
	// 입력된 수 만큼 n행 n열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
	// 중첩 반복문(for 혹은 while)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for (int j = 0; j<n; j++) {
			
			for(int i = 0; i<n; i++) {
				System.out.printf("%4d", j*(n)+i+1);
			}
			System.out.println();
		}
	}

}
