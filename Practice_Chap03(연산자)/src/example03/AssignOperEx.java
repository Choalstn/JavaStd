package example03;

public class AssignOperEx {

	public static void main(String[] args) {
		
		//복합대입 연산자를 이해  
		// 값을 누적시킬 때 많이 사용
		
		int result = 0;
		result += 10;
		
		System.out.println("result +=10 : " + result);
		
		result -= 5;
		System.out.println("result -=5 : " + result);
		
		result *= 5;
		System.out.println("result *=5 : " + result);
		
		result /= 5;
		System.out.println("result /=5 : " + result);
		
		result %= 5;
		System.out.println("result %=5 : " + result);

	}

}
