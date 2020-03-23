package ex13;

public class Main {

	// 문제
	// 1 2 3 4
	// 2 4 6 8
	// 3 6 9 12
	// 4 8 12 16
	// 중첩반복문(for 홋은 while), 배열
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int arr[][] = new int[n][n];
		
		for(int i = 0; i< n; i++) {
			for(int j = 0; j< n; j++) {
				arr[i][j]=(i+1)*(j+1);
			}
		}
		
		for(int i = 0; i< n; i++) {
			for(int j = 0; j< n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
