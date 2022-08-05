package example02;

public class BitOperatorEx {

	public static void main(String[] args) {
		
		//&, |, ^ 3개를 비트연산자라고 함  
		int x = -8;
		int y = -5;
		 
		System.out.println("x를 2진수 변환한 결과 : " + Integer.toBinaryString(x));
		System.out.println("y 를 2진수 변환한 결과 : " + Integer.toBinaryString(y));
		
		System.out.println("x와 y를 비트 AND 연산결과 : " + (x & y)); // 둘 다 1일 때 1
		System.out.println("x와 y를 비트 OR 연산결과 : " + (x | y)); // 둘 중 하나가 1일 때 1  
		System.out.println("x와 y를 비트 XOR 연산결과 : " + (x ^ y)); //서로 다를 때 1
		
	}

}
