package ex07;

public class Main {

	// ����
	// �Է��� �� �� �Ҽ����� �Ǻ�
	// �ݺ���(while, for), if
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		
		boolean isPrimeNumber = true;
		
		for(int i = 2; i<=num/2; i++) {
			if(num%i==0) {
				isPrimeNumber=false;
			}
			
		}
		if(isPrimeNumber) {
			System.out.println(num + " �� �Ҽ��Դϴ�.");
		}
		else {
			System.out.println(num+" �� �Ҽ��� �ƴմϴ�.");
		}
	}

}
