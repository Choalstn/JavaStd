package example01;

class A {
	int value;
}

class B {
	int value;
	public B(int value) {
		this.value = value;
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		
		A a = new A();
		
		//B클래스에 이미 생성자가 있기 때문에 컴파일러가 자동 생성 x
		// 매개변수 값을 넣어주거나 기본 생성자를 만드는 것이 해결법 
		//B b = new B();
		
		B b = new B(2);

	}

}
