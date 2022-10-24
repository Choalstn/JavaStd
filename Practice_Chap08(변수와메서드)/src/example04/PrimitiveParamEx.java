package example04;

class A {
	int data;
}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		
		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출 전, main()내의 값 : " + a.data);
		PrimitiveParamEx.dataChange(a.data);
		System.out.println("dataChange() 호출 후 값 : " + a.data);
		
	}
	
	public static void dataChange(int data) {
		//지역변수 data라는 값은 값 복사가 이루어졌기 때문에 호출한 곳에서는 아무런 영향을 받지 않음 
		data = 44;
		System.out.println("dataChange()내의 값 : " + data);
		return;
		
	}

}
