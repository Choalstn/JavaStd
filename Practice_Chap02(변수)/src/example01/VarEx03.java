package example01;

public class VarEx03 {

	public static void main(String[] args) {
		
		byte b1 = 127;
		//byte는 -128부터 127까지만 가능  
		//byte b1 + 2 == 오버플로우  
		
		byte b2 = (byte)(b1+2); //강제캐스팅  
		
		System.out.println(b1);
		System.out.println("강제 캐스팅 후 : " + b2);
		
		int i1 = b1; //자동캐스팅 형변환 코드 생략 가능  
		
		System.out.println("자동 캐스팅 후 : "+i1);
		
		int i2 = 100;
		float f1 = (float)(i2); //강제캐스팅 안 해도 정상 작동   
		System.out.println("실수 -> 정수 :  " + f1);
		
		float f2 = 10.55f;
		int i3 = (int)(f2);
		System.out.println("정수 -> 실수 :  " + i3); //데이터 손실 발생    
		
		char ch1 = 'a';
		int i4 = ch1;
		System.out.println("문자 -> 정수 :  " + i4); //아스키 코드 출력   
		
		
		System.out.println("----------------------------------------");
		
		System.out.println("char : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
		System.out.println("Byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("Short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("Int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("Long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		System.out.println("Float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("Double : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
	}

}
