package ex04;

public class Main {

	// ����
	// 10������ 2������ ��ȯ�Ͻÿ�.
	// �迭, �ݺ���(while, for)
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
