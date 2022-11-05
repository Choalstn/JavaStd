package example01;

public class Student {
	
	//인스턴스 멤버변수 선언 
	private String name;
	private int age;
	
	//option + space
	// 클래스명과 생성자명은 동일해야 한다
	// 생성자는 return 타입이 존재하지 않고, void도 작성하지 않음 
	// 생성자가 없는 클래스는 컴파일러가 알아서 생성 
	public Student() {
		System.out.println("기본 생성자 호출");
		return;
	}
	
	//매개변수가 있는 생성자 
	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name = name;
		this.age = age;
	}
	
	public Student(String name) {
		System.out.println("매개변수 name만 있는 생성자 호출");
		this.name = name;
	}
	
	public Student(int age) {
		System.out.println("매개변수 age만 잇는 생성자 호출");
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return this.getName() + ", " + this.getAge();
	}
	
	
}
