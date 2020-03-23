package ex26;

public class Main {

	// 문제
	// 백준2908번 숫자 거꾸로해서 비교
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 528;
		int b = 293;
		
		int arrA[] = new int [3];
		int arrB[] = new int [3];
		
		int lenA = 0;
		do {
			arrA[lenA] = a % 10;
			a /= 10;
			lenA++;
		} while (a > 0);
		
		int tranA = 0;
		int mux = 1;
		// 1 -> 10 -> 100 -> 1000 
		for (int i = arrA.length-1 ; i >= 0 ; i--) {
			tranA += arrA[i]*mux;
			mux*=10;
		}
		System.out.println("tranA = "+tranA);
		
		int lenB = 0;
		do {
			arrB[lenB] = b % 10;
			b /= 10;
			lenB++;
		} while (b > 0);
		
		int tranB = 0;
		mux = 1;
		// 1 -> 10 -> 100 -> 1000 
		for (int i = arrB.length-1 ; i >= 0 ; i--) {
			tranB += arrB[i]*mux;
			mux*=10;
		}
		System.out.println("tranB = "+tranB);
		
		if (tranA > tranB){
			System.out.println(tranA);
		}
		else {
			System.out.println(tranB);
		}
	}

}
