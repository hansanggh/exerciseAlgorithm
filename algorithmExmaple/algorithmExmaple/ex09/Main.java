package ex09;

public class Main {

	// ����
	// �� �ڸ����� �� ���ϱ�
	// �ݺ���(for, while)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNum = 1232;
		int accSum = 0;
		
		while(inputNum>0) {
			accSum += inputNum %10;
			inputNum /= 10;
		}
		
		System.out.println(accSum);
	}

}
