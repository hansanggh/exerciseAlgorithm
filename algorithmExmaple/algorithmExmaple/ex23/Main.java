package ex23;

public class Main {

	// 문제
	// 문자열 뒤집기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "ABCDEFH";
		
		char str[]=n.toCharArray();
		char tmp;
		int len = str.length;
		for(int i=0; i<len/2;i++) {
			tmp = str[i];
			str[i] = str[len-i-1];
			str[len-i-1] = tmp;
			
		}
		n=new String(str);
		System.out.println(n);
	}

}
