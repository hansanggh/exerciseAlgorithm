package ex02;

public class Main {

	// 문제
	// 피보나치 수열을 출력해라
	// An = An-1 + An-2
	// 1 1 2 3 5 8 13 21 34 ...
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = new int[100];
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1]+arr[i-2];
			
		}
		
		for(int i=3; i<10; i++) {
			System.out.println(arr[i]+" ");
		}
		
		// 2번재 방법
		
		int prevPrevNum = 1;	// An-2
		int prevNum = 1;		// An-1
		
		System.out.println(prevPrevNum+" ");
		System.out.println(prevNum+" ");
		
		for(int i=3; i<=10; i++) {
			int nNum = prevPrevNum+prevNum;
			System.out.println(prevPrevNum+prevNum+" ");
			
			prevPrevNum = prevNum;
			prevNum = nNum;
		}
		
		
	}

}
