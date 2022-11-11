package example04;

import java.util.Calendar;
import java.util.Date;

public class UserEx {

	public static void main(String[] args) {
		
		//User user1 = new User();
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		//싱글톤 패턴을 사용하는 실제 예시 
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		System.out.println(d);
		
		
		System.out.println(user1);
		System.out.println(user2);
		user1.add(); 

		//객체의 == 연산은 주소값 비교 연산 
		if(user1.equals(user2)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		//싱글톤패턴 사용 이유
		//단 하나의  인스턴스를 생성해서 서로 공유를 원할 때 사용
		//ex)사용자 환경설정, 커넥션풀, 스레드풀, os의 시간 또는 날짜  
	}

}
