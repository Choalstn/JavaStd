package example03;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			
			System.out.println("----------------------");
			System.out.println("1.증속  |  2.감속  |  3.정지");
			System.out.println("----------------------");
			System.out.println(" ");
			
			System.out.print("입력 : ");
			int choice = sc.nextInt();
			
			if(choice==1) {
				System.out.println("");
				System.out.println("현재 속도 : " + ++speed);
				System.out.println("");
			} else if(choice == 2) {
				System.out.println("");
				System.out.println("현재 속도 : " + --speed);
				System.out.println("");
			} else if(choice == 3){
				run = false;
			} else {
				System.out.println("");
				System.out.println("잘못된 입력입니다.");
				System.out.println("");
			}
			
		}
		System.out.println("");
		System.out.println("프로그램 종료");
		
		sc.close();

	}

}
