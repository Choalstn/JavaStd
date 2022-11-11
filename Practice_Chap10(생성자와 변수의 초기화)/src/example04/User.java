package example04;

public class User {
	
	//정적멤버 선언과 동시에 생성 
	private static User singleton = new User();
	
	//해당 클래스를 외부에서 new 연산자로 인스턴스 생성 불가능 
	private User() {}
	
	public void add() {
		System.out.println("add메서드 호출");
	}
	
	//해당 클래스의 멤버의 주소를 넘겨주기(공유) 위해 외부에서 호출할 수 있는 getter() 
	public static User getInstance() {
		return User.singleton;
	}

}
