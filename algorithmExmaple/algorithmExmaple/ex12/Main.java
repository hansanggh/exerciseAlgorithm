package ex12;

public class Main {

	// ����
	// ���� ��� ���ڻ簢��
	// ��ø�ݺ���(for Ȥ�� while) , if
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		int arr[][]= new int[n][n];
		
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[j][i] = num;
				num++;
			}
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
