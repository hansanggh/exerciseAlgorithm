package ex37;

public class Main {

	// ����
	// ������, ����� ���� ���
	// 1�� � �� �ִ���
	
	static final int SIZE = 5;
	static final int APART = 1;

	static int apartCnt = 0;
	static int []houseHold = new int[10];
	
	static int [][]map = 
			   {{0,0,0,1,1},
			   {0,0,0,0,1},
			   {1,0,0,0,0},
			   {1,1,0,0,0},
			   {1,1,0,1,1}};
	
	
	public static void doFunc(int y, int x, int apartIndex) {
		map[y][x] = 0;
		houseHold[apartIndex]++;
		// ��ĥ�ϱ�� ����
		if (x - 1 >= 0 && map[y][x-1] == APART)
			doFunc(y, x-1, apartIndex);
		if (x + 1 <= SIZE-1 && map[y][x+1] == APART)
			doFunc(y, x+1, apartIndex);
		if (y + 1 <= SIZE-1 && map[y+1][x] == APART)
			doFunc(y+1, x, apartIndex);
		if (y - 1 >= 0 && map[y-1][x] == APART)
			doFunc(y-1, x, apartIndex);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < SIZE; i++){
			for (int j = 0; j < SIZE; j++){
				if (map[i][j] == 1) {
					doFunc(i, j, apartCnt);
					apartCnt++;
				}
			}
		}
		
		System.out.println(apartCnt);
		for(int i : houseHold) {
			System.out.print(i + " ");	
		}
	}

}
