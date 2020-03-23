package ex05;

public class Main {

	// 문제
	// 대문자는 소문자로 소문자는 대문자로 변환하시오.
	// 배열, for, if
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "helloWorlD";
		char[]arr;
		arr = input.toCharArray();
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>='a' && arr[i]<='z') {
				arr[i] = (char)(arr[i]+'A'-'a');
			}
			else if(arr[i]>='A' && arr[i]<='Z') {
				arr[i] = (char)(arr[i]-('A'-'a'));
			}
		}
		
		System.out.print(arr);
	}

}
