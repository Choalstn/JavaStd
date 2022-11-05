package example01;

public class StudentEx {

	public static void main(String[] args) {
		
		// 기본 생성자  호출 
		Student student = new Student();
		System.out.println(student);
		
		// 매개변수가 있는 생성자 호출 
		Student student2 = new Student("곰잼", 23);
		System.out.println(student2);
		
		Student student3 = new Student("곰잼");
		System.out.println(student3);
		
		Student student4 = new Student(23);
		System.out.println(student4);
		
		

	}

}
