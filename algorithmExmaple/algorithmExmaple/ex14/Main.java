package ex14;

public class Main {

	// ����
	// �Էµ� ������ ������ ����Ͻÿ�.
	// �ݺ���(forȤ�� while), �迭, %
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
