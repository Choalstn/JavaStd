package example03;

public class BlockEx {
	
	//인스턴스 초기화 블럭, 인스턴스 생성 때마다 호출, 힙에 생성 
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	
	//정적 초기화 블럭, 단 한 번만 실행, class 영역에 올라감
	static {
		System.out.println("정적 초기화 블럭 실행");
	}
	
	public BlockEx() {
		System.out.println("기본 생성자 호출");
	}
	
	//초기화 순서
	//클래스 변수 
	//기본값 -> 명시적 초기화 -> 클래스 초기화 블럭 
	
	//인스턴스 변수
	//기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자 

	public static void main(String[] args) {
		
		BlockEx b1 = new BlockEx();
		

	}

}
