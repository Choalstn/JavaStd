package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//Ctrl + shift + o == 자동 임포트 
		//입력을 받기 위한 클래스이고, 입력스트림   
		Scanner sc = new Scanner(System.in);
		//System.out.print("정수 한 자리를 입력 :  ");
		//int num = sc.nextInt();
		//System.out.println("사용자로부터 입력받은 int :  " + num);
		
		
		//System.out.print("실수 한 자리를 입력 :  ");
		//double dnum = sc.nextDouble();
		//System.out.println("사용자로부터 입력받은 double :  " + dnum);
		
		
		String str1 = sc.next(); //next() 메소드는 공백을 기준으로 입력 -- 단어 입력  
		sc.nextLine();
		String str2 = sc.nextLine(); //공백포함, 엔터키를 입력할때까지 입력 받음  -- 문장 입력 
		
		System.out.println("next() 메소드 :  " + str1);
		System.out.println("nextLine() 메소드 :  " + str2);
		
		
		
		sc.close(); //자원은 사용하고 나서 반드시 닫아줘야함  

	}

}
