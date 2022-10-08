package example02;

public class StudentEx {

	public static void main(String[] args) {
		
		//아래는 각각 독립된 저장 공간을 가지는 인스턴스가 힙에 할당 
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.age = 23;
		s1.name = "Jam";
		
		//s1의 주소를 s2에 대입
		//원래 s2가 가르키고 있던 인스턴스는 쓰레기 객채가 된다.
		//쓰레기 객체는 gc(garbage collector)에 의해 수거 = 자바가 메모리 관리가 필요없는 이유 
		s2 = s1;
		
		s2.age = 20;
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
	}

}
