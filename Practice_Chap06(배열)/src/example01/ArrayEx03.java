package example01;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		//40byte가 heap에 생성 
		int[] arr1 = new int[10];
		
		//6byte heap에 생성
		char[] chArr = new char[] {'a', 'b', 'c'};
		
		//1~10까지의 난수 대입 
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random() * 10)+1;
		}
		
		for(int i=0; i<arr1.length; i++) {
			if(i==9) {
				System.out.print(arr1[i]);
			} else {
				System.out.print(arr1[i] + ",");
			}
		}
		
		System.out.println(" ");

		//Arrays는 배열 조작을 쉽게 하기 위한 유틸리티 클래스 
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Arrays.toString(chArr));
		
		//주소값이 아님 
		System.out.println(chArr);
		//char 타입의 배열 주소값 출력 
		System.out.println(chArr.toString());
		
		//주소값 출력  
		System.out.println(arr1);

	}

}
