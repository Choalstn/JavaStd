package example03;

import java.util.Arrays;

public class ProductEx {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		
		System.out.println("Product.number : " + Product.number + " , CountNo : " + p1.countNo);
		System.out.println(Arrays.toString(p1.arr));
		System.out.println("Product.number : " + Product.number + " , CountNo : " + p2.countNo);
		System.out.println(Arrays.toString(p2.arr));
		System.out.println("Product.number : " + Product.number + " , CountNo : " + p3.countNo);
		System.out.println(Arrays.toString(p3.arr));
	}

}
