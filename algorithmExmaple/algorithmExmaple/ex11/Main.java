package ex11;

public class Main {

	// 문제
	// 지그재그 숫자사각형
	// 중첩 반복문(for혹은 while), 조건문(if), 배열
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int arr[][] = new int [n][n];
		
		for(int i=0;i<n;i++) {
			
			if(i%2==0) {
				for(int j=0; j<n; j++) {
					arr[i][j] = i*n+j+1;
				}
			}
			else {
				for(int j=0; j<n; j++) {
					arr[i][j] = i*n+n-j;
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
