package example03;

public class Monitor {
	
	//멤버변수(필드) 
	String color;
	int channel;
	int volume; //소리볼륨
	boolean power;
	
	//멤버메서드 
	
	//
	public void power() {
		if(!this.power) {
			System.out.println("모니터가 켜졌습니다.");
		} else {
			System.out.println("모니터가 꺼졌습니다.");
		}
		
		this.power = !power;	
	}
	
	public void channelUp() {
		this.channel++;
		System.out.println("현재 채널 : " + this.channel);
	}
	
	public void channelDown() {
		//this.channel--;
		System.out.println("현재 채널 : " + (--this.channel) );
	}
	
	public void volumeUp() {
		this.volume++;
		System.out.println("현재 볼륨 : " + this.volume);
	}
	
	public void volumeDown() {
		this.volume--;
		System.out.println("현재 볼륨 : " + this.volume);
	}
	
	@Override
	public String toString() {
		return "현재 채널 : " + this.channel + ", " + "현재 볼륨 : " + this.volume; 
	}
	

}
