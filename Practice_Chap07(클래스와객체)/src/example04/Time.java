package example04;

public class Time {
	
	//접근제어자 종류 
	//private : 같은 클래내에서만 접근 가능 
	//protected : 같은 패키지, 자손클래에서만 접근 가능 
	//default : 같은 패키지에서만 접근 가능 
	//public : 누구나 접근 가능 
	
	//웬만하면 멤버변수는 private으로 감싸주고(캡슐화), 각 멤버변수에 해당하는 getter()를 제공하는 방법으로 클래스를 작성하는 것이 올바르다 
	private int hour;
	private int minute;
	private int second;
	
	//source 탭 -> generate getter and setter에서 원하는 멤버변수를 체크 getter, setter 메서드를 자동 완성
	//getter() : 멤버변수의 값을 읽어가는 메서드
	//setter() : 멤버변수의 값을 수정하는 메서드 
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		//시에 대한 예외처리
		if(hour < 0 || hour > 23) {
			System.out.println("시 잘못 입력");
			return;
		}
		
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("분 잘못 입력");
			return;
		}
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("초 잘못 입력");
			return;
		}
		this.second = second;
	}
	
	@Override
	public String toString() {
		return this.getHour() + "시 " + this.getMinute() + "분 " + this.getSecond() + "초";
	}

	

}
