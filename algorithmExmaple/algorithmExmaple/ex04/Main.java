package ex04;

public class Main {

	// 문제
	// 10진수를 2진수로 변환하시오.
	// 배열, 반복문(while, for)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNum = 25;
		int bin[] = new int[100];
		
		int i = 0;
		int mok = inputNum;
		
		while(mok>0){
			bin[i] = mok % 2;
			mok/=2;
			i++;
		}
		
		i--;
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
	}

}
