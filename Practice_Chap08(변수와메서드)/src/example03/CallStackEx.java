package example03;

public class CallStackEx {

	public static void main(String[] args) {
		System.out.println("main 메서드 실행");
		CallStackEx.first();
		System.out.println("main 메서드 종료");
	}
	
	public static void first() {
		System.out.println("fisrt 메서드 실행");
		CallStackEx.second();
		System.out.println("first 메서드 종료");
	}
	
	public static void second() {
		System.out.println("second 메서드 실행");
		CallStackEx.third();
		System.out.println("second 메서드 종료");
	}

	public static void third() {
		System.out.println("third 메서드 실행");
		System.out.println("third 메서드 종료");
	}

}
