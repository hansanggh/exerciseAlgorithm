package ex16;

public class Main {

	// 문제
	// 별출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
