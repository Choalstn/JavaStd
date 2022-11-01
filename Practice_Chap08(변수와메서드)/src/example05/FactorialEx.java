package example05;

public class FactorialEx {

	public static void main(String[] args) {
		
		long result = FactorialEx.factorial(5);
		System.out.println("5!의 값 : " + result);

	}
	
	public static long factorial(long n) {
		
		long result = 0;
		
		//n=1일 때 재귀호출이 더 이상 이루어지지 않음 
		if(n==1) {
			result = 1;
		}
		else {
			result = n * factorial(n-1); //재귀호출이 직접적으로 발생하는 곳 
			System.out.println("result값 : " + result + " n값 : " + n);
		}
		
		return result;
	}

}
