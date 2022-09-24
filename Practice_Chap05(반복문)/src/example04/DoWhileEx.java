package example04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하시려면 q를 입력하세요");
		String str = null;
		
		
		//do-while 문은 최소 한 번 이상 무조건 수행을 하는 반복문
		//조건문이 뒤에 위치하기 때문에
		do {
			
			System.out.print(">");
			str = sc.nextLine();
			System.out.println("입력받은 메세지 : " + str);
			
		} while(!str.equals("q"));
		
		System.out.println("프로그램 종료");
		
		sc.close();

	}

}
