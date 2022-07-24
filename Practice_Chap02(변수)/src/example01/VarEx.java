package example01;

public class VarEx {

	public static void main(String[] args) {
		
		int year = 0;
		int age = 23;
		long result1 = 10L;
		float result2 = 0.1f;
		char ch ='A';
		
		
		System.out.println("ch : " + ch);
		System.out.println(year + age);
		String str = new String("Java");
		System.out.println(str);
		System.out.println(str.toString());
		
		
		//사용자 정의 클래스이거나  toString() 재정의를 하지 않은 클래스의 참조변수는 
		// 클래스타@16진수(주소)가 출력   
		Object obj = new Object();
		System.out.println(obj);
		
		
		
	}

}
