package example04;

public class CotinueEx {

	public static void main(String[] args) {
		
		//1~100까지의 사이에서 홀수만 출력하기
		
		for(int i=1; i<=100; i++) {
			
			//continue 문은 뒷문장은 실행 하지 않고 바로 증감식으로 이동한다
			if((i%2)==0) {
				continue;
			} else {
				System.out.println("홀수값 출력 : " + i);
			}
		}


	}

}
