package example02;

public class MemberEx {

	public static void main(String[] args) {
		
		Member.smethod();
		Member.cv = 500;
		Member.smethod();
		
		Member mem = new Member();
		
		//인스턴스 멤버를 사용하기 위해서는 반드시 new 연산자로 인스턴스 생성해야 함 
		mem.imethod();
		mem.iv = 999;
		mem.imethod();
		

	}

}
