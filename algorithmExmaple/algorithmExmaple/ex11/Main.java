package ex11;

public class Main {

	// ����
	// ������� ���ڻ簢��
	// ��ø �ݺ���(forȤ�� while), ���ǹ�(if), �迭
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int arr[][] = new int [n][n];
		
		for(int i=0;i<n;i++) {
			
			if(i%2==0) {
				for(int j=0; j<n; j++) {
					arr[i][j] = i*n+j+1;
				}
			}
			else {
				for(int j=0; j<n; j++) {
					arr[i][j] = i*n+n-j;
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
