package ex27;

public class Main {

	// 문제
	// 달팽이 숫자 배열
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int arr[][] = new int[10][10];
		int x = 0;
		int y = 0;
		int num = 1;
		int f = n;
				
		for (int i = 0; i < 2*n-1; i++) {
			switch (i % 4) {
			case 0:
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					x++;
					num++;
				}
				x--;
				y++;
				f--;
				break;
			case 1:
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					y++;
					num++;
				}
				y--;
				x--;
				break;
			case 2:
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					x--;
					num++;
				}
				x++;
				y--;
				f--;
				break;
			case 3:
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					y--;
					num++;
				}
				y++;
				x++;
				break;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n ; j++){
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
