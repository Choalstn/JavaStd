package example04;


public class ReferenceParamEx {

	public static void main(String[] args) {
		
		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출 전, main()내의 값 : " + a.data);
		dataChange(a);
		System.out.println("dataChange() 호출 후 값 : " + a.data);
		
	}
	
	public static void dataChange(A a) {
		//a라는 주소값은 매개변수로 넘어왔기 때문에 주소를 공유한다. 
		//a라는 주소를 공유하게 되면 호출한 곳에서는 영향을 받는다.
		a.data = 44;
		System.out.println("dataChange()내의 값 : " + a.data);
		return;
		
	}

}
