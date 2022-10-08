package example02;

public class Student {
	
	//멤버변수(필드)
	String name;
	int age;
	
	
	
	//Object 클래스의 toString을 오버라이딩(재정의) 
	@Override
	public String toString() {
		
		//this : 클래스의 주소(new라는 연산자가 인스턴스를 생성하면 활성화 됨)
		//this는 절대 static 메서드나 클래스 안에서 사용 하지 못함 
		String str = "이름 : " + this.name + ", " + "나이 : " + this.age;
		
		 return str;
	} 

}
