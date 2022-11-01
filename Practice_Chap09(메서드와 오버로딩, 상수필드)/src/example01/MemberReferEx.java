package example01;

public class MemberReferEx {
	
	int iv; //인스턴스 밈버변수 
	static int cv; //정적 멤버변수 (클래스 멤버변수)
	
	//인스턴스 메서드 
	//이유 : 인스턴스 메서드가 호출될 때는 이미 인스턴스가 생성되어 있을 것임 
	public void instanceMethod() {
		System.out.println(this.iv); //인스턴스 변수 사용 가능 
		System.out.println(cv); //클래스 변수 사용 가능 
		staticMethod();
	}
	
	//인스턴스가 언제 생성될지 모르기 때문에 클래스 메서드 안에서 인스턴스 멤버들 사용 불가 
	public static void staticMethod() {
		//System.out.println(this.iv); //인스턴스 변수 사용 불가 
		System.out.println(cv); //클래스 변수 사용 가능 
		//this.instanceMethod(); //인스턴스 메서드 사용불
		
	}

}
