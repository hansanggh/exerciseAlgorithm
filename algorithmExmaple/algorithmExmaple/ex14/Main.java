package ex14;

public class Main {

	// 문제
	// 입력된 숫자의 개수를 출력하시오.
	// 반복문(for혹은 while), 배열, %
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNum = 421314218;
		int arr[] = new int[10];
		
		while(inputNum>0) {
			arr [inputNum%10]++;
			inputNum/=10;
		}
		
		for(int i = 0; i<10;i++) {
			System.out.println(i+": " + arr[i]);
		}
	}

}
