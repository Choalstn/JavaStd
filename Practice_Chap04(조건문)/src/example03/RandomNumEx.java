package example03;

import java.util.Scanner;

public class RandomNumEx {

	public static void main(String[] args) {
		
		int correctAnswer = (int)(Math.random()*10)+1;
		System.out.println("정답 : " + correctAnswer);
		System.out.println("--------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 맞춰보세요(1~10) : ");
		int userAnswer = sc.nextInt();
		
		if(correctAnswer == userAnswer) {
			System.out.println("정답입니다 ~ ");
		} else {
			System.out.println("오답입니다 ㅠㅠ");
		}

	}

}
