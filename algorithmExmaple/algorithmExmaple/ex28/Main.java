package ex28;

public class Main {

	// ����
	// 10������ 2~16������ ��ȯ�ϱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char n[] = new char[100];
		// char �迭�� ��������
		int num = 200;
		int jinsu = 8;
		
		int i = 0;
		while (num > 0) {
			int tmp = num % jinsu;
			
			if (tmp >= 10 && tmp <=15) {
				n[i] = (char) ('A' + (tmp-10));
			}
			else {
				n[i] = (char) ('0'+tmp); // ���� -> ����
			}
			num /= jinsu;
			i++;
		}
		
		for ( ; i>=0 ; i--) {
			System.out.print(n[i]);
		}
	}

}
