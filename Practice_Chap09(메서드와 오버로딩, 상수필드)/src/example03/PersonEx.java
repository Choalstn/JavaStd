package example03;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p = new Person(23);
		
		//final 속성은 상수이므로 초기화가 된 후에 값 변경 불가능 
		//p.nation = "USA";
		//p.age = 100;
		
		System.out.println(p);
		System.out.println(Person.MAX_NUMBER);

	}

}
