package example02;

public class Calculator {

	//인스턴스 메서드 
	public int add(int x, int y) {
		
		Calculator.div(10.5, 11.7);
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
	
	public static long mul(long x, long y) {
		//this.add(1,2);
		//static 메서드 안에 인스턴스 메서드 호출 x
		return x * y;
	}
	
	public static double div(double x, double y) {
		return x / y;
	}
	
}
