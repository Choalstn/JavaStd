package example01;

public class IncreDcreEx {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		System.out.println("_____________________________");
		
		System.out.println("x = " + (x++)); //후위증가연산  
		System.out.println("x = " + x);
		
		System.out.println("y = " + (++y)); //전위증가연산  
		System.out.println("y = " + y);
		
		System.out.println("_____________________________");
		
		System.out.println("(x++) + (++y) = " + ((x++) + (++y)));

	}

}
