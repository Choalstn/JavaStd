package example01;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를  입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			//중첩 if문은 무제한적으로 들어갈 수 있는데, 가독성을 위해 2개를 초과하지 않도록 하는 것이 바람직  
			if(score>=95) {
				System.out.println("A+");
			} else {
				System.out.println("A0");
			}
		}
		else if(score >= 80) {
			if(score>=85) {
				System.out.println("B+");
			} else {
				System.out.println("B0");
			}
		}
		else if(score >= 70) {
			if(score>=75) {
				System.out.println("C+");
			} else {
				System.out.println("C0");
			}
		}
		
		sc.close();

	}

}
