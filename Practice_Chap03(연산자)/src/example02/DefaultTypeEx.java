package example02;

import javax.annotation.processing.SupportedSourceVersion;

public class DefaultTypeEx {

	public static void main(String[] args) {
		
		byte b1 = 127;
		byte b2 = 1;
		char ch = 'A'; //A는 아스키코드 값으로 65  
		float f1 = 15.5f;
		double d1 = 10.5;
		
		// 1번째 방법 : int형으로 받기(자동 캐스팅)  
		// 2번째 방법 : 강제 캐스팅  
		
		int i1 = b1+b2;
		
		byte b3 = (byte)(b1+b2);
		
		int i2 = ch + b2;
		
		//정수형 + 실수형 --> 표현범위가 넓은 쪽으로 형변환 되어 연
		float i3 = b1 + f1;
		
		// double + float == double + double = double
		double d2 = f1 + d1;
		
		System.out.println(i1 + " , " + b3 + " , " + i2 + " , " + i3 + " , " + d2);
		

	}

}
