package ex10;

public class Main {

	// ����
	// �Էµ� �� ��ŭ n�� n���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�.
	// ��ø �ݺ���(for Ȥ�� while)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for (int j = 0; j<n; j++) {
			
			for(int i = 0; i<n; i++) {
				System.out.printf("%4d", j*(n)+i+1);
			}
			System.out.println();
		}
	}

}
