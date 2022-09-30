package example03;

public class StringArrayEx {

	public static void main(String[] args) {
		
		//String 배열 
		//객체 배열 == 클래스 배열  -> 2차원 배열 형태 
		String[] str = new String[] { "안녕", "홍길동", "김연아"};
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		//향상된 for문 
		for( String str1 : str ) {
			System.out.println(str1);
		}
		
		
		//System.out.println("String 배열의 주소 : " + str.toString());

	}

}
