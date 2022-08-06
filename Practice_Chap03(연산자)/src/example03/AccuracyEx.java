package example03;

public class AccuracyEx {

	public static void main(String[] args) {
		
		//CPU 연산의 오차 이해
		int apple = 1;
		double unit = 0.1;
		int num = 7;
		
		double result = apple - (num * unit);
		double result2 = (num * unit);
		
		System.out.println(result2 );
		
		System.out.println("1-(7*0.1) = "+result );

	}

}
