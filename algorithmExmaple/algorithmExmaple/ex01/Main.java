package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//	����
//	
//	�л��������� �����ϰ�, �л��̸����� �˻����� �� �й��� ����ϴ� ���α׷� �ۼ�
//	
//	student Ŭ���� ����
//	Strung name, no�� ���� (�̸��� �й�)
//	�л����� arraylist�� ������ ����, ��� �˻��ϰڴ��� y -> �ݺ�
//	�����ϰ� ������ n -> ���α׷� ����
//	�л� �̸��� �ִ� ��� �� �л��� �й��� ���
//	�л� �̸��� ������, ���� �л��̸��̶�� ���
//	>>>while, flag, arraylist, foreach
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1 = new Student("�տ���1","1682");
		Student st2 = new Student("�տ���2","1782");
		Student st3 = new Student("�տ���3","1882");
		
		ArrayList<Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for (Student stu:list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("��� �˻��� �ϰ� �����ø� y, �����ϰ� �����ø� n");
					
			String input = scan.next();
			
			if(input.equals("y")) {
			
				System.out.println("�˻��� �����մϴ�.");

				String name = scan.next();
				boolean flag = false;
				
				for (Student stu:list) {
					if(name.equals(stu.getName())) {

						System.out.println("�ش��ϴ� �л��� �й��� "+stu.getNo());		
						flag=true;
					}
				
				}
				if(!flag) {
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}
				
			}else if(input.equals("n")){
			
				break;
			
			}
		}
		System.out.println("����Ǿ����ϴ�.");
	}

}
