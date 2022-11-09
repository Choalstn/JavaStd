package example03;

public class Product {
	
	static int number = 0;
	int countNo;
	int[] arr = new int[10];
	
	//정적 초기화 블럭
	static {
		System.out.println("정적 초기화 블럭 호출");
	}
	
	//인스턴스 초기화 블럭임에도 정적 변수 사용 가능 
	{
		System.out.println("인스턴스 초기화 블럭 실행");
		++number;
		this.countNo = number;
		
		for(int i=0; i<arr.length; i++) {
			this.arr[i] = (int)(Math.random()*10) +1;
		}
	}
	
	public Product() {
		System.out.println("기본 생성자 호출");
		
		for(int i=0; i<arr.length; i++) {
			this.arr[i] = (int)(Math.random()*10) +1;
		}
	}

}
