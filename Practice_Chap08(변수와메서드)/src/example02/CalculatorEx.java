package example02;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("Divide : " + Calculator.div(5.3, 1.3));
		System.out.println("Multiply : " + Calculator.mul(3, 4));
		
		System.out.println("Add : " + cal.add(5, 6));
		System.out.println("Substract : " + cal.sub(10, 9));
		

	}

}
