package example02;

import java.util.Arrays;
import java.util.Scanner;

public class SecondArrayEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] student; //2차원 배열 선언 
		int count=0, sum=0, num=0, total=0; //반수, 인원, 합, 계
		double avg=0.0, avgTotal=0.0;
		
		System.out.print("반 수를 입력하세요 : ");
		count = sc.nextInt();
		student = new int[count][]; //반의 갯수를 1차원 배열로 heap에 할당 
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d반의 인원 : ", i+1);
			num = sc.nextInt();
			student[i] = new int[num];
			
			for(int j=0; j<student[i].length; j++) {
				System.out.printf("%d반의 %d번의 점수 : ", (i+1), (j+1));
				student[i][j] = sc.nextInt(); //실제 반 인원의 점수를 받는다 
				
			}
			System.out.println();
			
		}
		
		System.out.println("반		합계		평균");
		System.out.println("===================================");
		
		for(int i=0; i<student.length; i++) {
			sum=0;
			for(int j=0; j<student[i].length; j++) {
				sum += student[i][j]; //반별 합계  
			}
			total += sum; //총 합계 
			avg = (double)sum/student[i].length; //반 평균
			avgTotal += avg; //총 평균의 합 
			System.out.printf("%d반		%d		%.1f\n", (i+1), sum, avg);
		}
		
		avgTotal = avgTotal / student.length;
		System.out.printf("계		%d		%.1f\n", total, avgTotal);
		
		
		
		sc.close();

	}

}
