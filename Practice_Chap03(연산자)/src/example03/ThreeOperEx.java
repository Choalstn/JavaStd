package example03;

import java.util.Scanner;

public class ThreeOperEx {

	public static void main(String[] args) {
		
		//삼항 연산자를 사용하는 방법  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.println("당신의 등급 : " + grade);
		
		grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'C';
		System.out.println("당신의 등급 : " + grade);
		
		sc.close();
	}

}
