package example01;

public class VarEx02 {

	public static void main(String[] args) {
		
		int number; 
		number = 200;
		
		int number2 = 500;
		
		System.out.println(number);
		System.out.println(number2);
		
		String str = new String("Bread");
		System.out.println(str);
		str = null;
		System.out.println(str);
		
		final int MAX = 200;
		// final을 붙였으므로 MAX는 상수 = 변하지 않는 값  
		// 상수는 선언과 동시에 초기화를 한 후, 값 변경 안 됨   
		// 상수는 대문자로 작성  
		
	}

}
