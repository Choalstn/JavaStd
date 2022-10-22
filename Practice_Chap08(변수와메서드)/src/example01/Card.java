package example01;

public class Card {
	
	//인스턴스 변수 -- 반드시 인스턴스를 생성해야 접근 가능 
	private String color;
	private String company;
	
	//static변수(정적,클래스 공유 변수) -- 인스턴스 생성 없이도 클래스명.static으로 접근 가능 
	static int width = 100;
	static int height = 50;
	
	
	//getter, setter 인스턴스 메서드 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public void show() {
		//메서드 안에서는 static 변수 사용 x 
		//static의 특성은 인스턴스 생성없이도 접근 가능하다는 것, 근데 언제 인스턴스가 생성될지 모르기 때문에 올바르지 않음 
		String color = this.color;
		String company = this.company;
		System.out.println(color + "," + company);
	}
	
	
	@Override
	public String toString() {
		//static 변수는 접근 방식이 반드시 클래스명.static 변수명으로 접근 해야 한다. 
		return "card1의 색상 : " + this.getColor() + "  card1의 회사 : " + this.getCompany() +
				"  크기 : (" + Card.height + "," + Card.width + ")";
	}
	
	

}
