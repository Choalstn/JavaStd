package example02;

class A {
	int data1 = 10;
	int data2 = 3 ;
}

public class AccumulatorEx {

	public static void main(String[] args) {
		
		Accumulator acc = new Accumulator();
		
		System.out.println("result : " + acc.add(10, 50));
		System.out.println();
		
		//아래 코드에서 L을 안 붙이면 시스템은 add(intx, int y) 메서드를 출력 
		//System.out.println(acc.add(100, 500L));
		
		System.out.println("result : " + acc.add(10, 100000L));
		System.out.println();
		
		System.out.println("result : " + acc.add(1003560L, 45));
		System.out.println();
		
		System.out.println("result : " + acc.add(10.532, 59.4592));
		System.out.println();
		
		System.out.println("result : " + acc.add(new int[] {1,2,9,4,5}));
		System.out.println();
		
		System.out.println("result : " + acc.add(new A()));
		
		
	}

}
