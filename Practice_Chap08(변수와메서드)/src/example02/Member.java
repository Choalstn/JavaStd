package example02;

public class Member {
	
	int iv = 100;
	static int cv = 200;
	
	public void imethod() {
		
		System.out.println("iv : " + this.iv);
		
	}
	
	public static void smethod() {
		
		//System.out.println("iv : " + this.iv); 안 됨, 언제 인스턴스가 만들어질지 모르기 때문 
		System.out.println("cv : " + Member.cv);
	}

}
