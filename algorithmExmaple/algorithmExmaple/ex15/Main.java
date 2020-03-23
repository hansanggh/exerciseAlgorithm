package ex15;

public class Main {

	// 문제
	// 구구단 출력
	// 반복문(while, for)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s= 2;
		int f= 5;
		
		for (int i=1; i<=9; i++) {
			for(int dan=s; dan<=f;dan++) {
				System.out.printf("%2d *%2d =%3d",dan,i,dan*i);
			}
			System.out.println();
		}
	}

}
