package ex08;

public class Main {

	// ����
	// �Էµ� ���� ���丮���� ���Ͻÿ�
	// �ݺ���(for, while)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNum = 5;
		int accNum = 1;
		
		for(int i = 1; i<=inputNum; i++) {
			accNum*= i;
		}
		
		System.out.println(accNum);
	}

}
