package example03;

public class MethodEx {
	//함수 == 메서드 
	//메서드 선언부 구성  
	//1. 리턴타입(반환값) : int
	//2. 메서드명  
	//3. () : 매개변수, 인자값, 아규먼츠 
	
	public static int add(int x, int y) {
		//int temp = 0;
		//temp = x + y;
		//System.out.println(temp);
		return x + y;
	}
	
	public static int minus(int x, int y) {
		
		return x - y;
		
	}
	
	public static int mul(int x, int y) {
		
		return x * y;
		
	}
	
	public static int div(int x, int y) {
		
		return x / y;
	}

	

	
	public static void main(String[] args) {
		
		//값에 의한 복사(Call by Value) 
		System.out.println(add(10,20));
		System.out.println(minus(10,20));
		System.out.println(mul(10,20));
		System.out.println(div(10,20));
	}

}
