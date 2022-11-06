package example02;

public class Car {
	
	String color;
	String gearType;
	int door;
	
	//기본 생성자
	//
	public Car() {
		//같은 클래스 내의 있는 매개변수가 3개 있는 생성자를 호출 
		this("검정", "자동", 4);
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	
	public Car(int door) {
		this.door = door;
	}
	
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}

	//this. 는 참조변수와 같은 역할 + 매개변수와 멤버변수 구분 
	public Car(String color, String gearType, int door) {
		//color = color; 변수의 모호성 발생 
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	//인스턴스 복제를 위한 생성자 
	public Car(Car c) {
		//color = color; 변수의 모호성 발생 
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
	
	@Override
	public String toString() {
		return this.color + " , " + this.gearType + " , " + this.door;
	}

}
