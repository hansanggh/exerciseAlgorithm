package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//	문제
//	
//	학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성
//	
//	student 클래스 생성
//	Strung name, no를 가짐 (이름과 학번)
//	학생들을 arraylist에 저장한 이후, 계속 검색하겠느냐 y -> 반복
//	종료하고 싶으면 n -> 프로그램 종료
//	학생 이름이 있는 경우 그 학생의 학번을 출력
//	학생 이름이 없으면, 없는 학생이름이라고 출력
//	>>>while, flag, arraylist, foreach
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1 = new Student("손오공1","1682");
		Student st2 = new Student("손오공2","1782");
		Student st3 = new Student("손오공3","1882");
		
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
			System.out.println("계속 검색을 하고 싶으시면 y, 종료하고 싶으시면 n");
					
			String input = scan.next();
			
			if(input.equals("y")) {
			
				System.out.println("검색을 시작합니다.");

				String name = scan.next();
				boolean flag = false;
				
				for (Student stu:list) {
					if(name.equals(stu.getName())) {

						System.out.println("해당하는 학생의 학번은 "+stu.getNo());		
						flag=true;
					}
				
				}
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
				
			}else if(input.equals("n")){
			
				break;
			
			}
		}
		System.out.println("종료되었습니다.");
	}

}
