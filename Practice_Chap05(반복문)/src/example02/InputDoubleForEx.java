package example02;

import java.util.Scanner;

public class InputDoubleForEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 몇 단부터 출력할까요 ? :");
		int start = sc.nextInt();
		
		System.out.print("구구단을 몇 단까지 출력할까요 ? :");
		int end = sc.nextInt();
		
		for(; start<=end; start++) {
			for(int j=1; j<=9; j++) {
				System.out.println(start + "*" + j + "=" + start*j );
			}
			System.out.println("--------------------------------");
		}
		
		sc.close();

	}

}
