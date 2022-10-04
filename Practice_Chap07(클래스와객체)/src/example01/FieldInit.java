package example01;

//붕어빵 틀을 만드는 작업 
public class FieldInit {
	
	//기본형 변수
	byte byteField;     //1
	short shortField;   //2
	int intField;       //4
	long longField;     //8
	
	boolean boolField;  //1
	char charField;     //2
	
	float floatField;   //4
	double doubleField; //8
	
	//참조형 변수
	int[] arrField;     //4
	String strField;    //4
	
	
	//annotaion : 컴파일러에게 강한 컴파일 요구
	//toString() 역할 : 클래스의 멤버변수(필드)의 값들을 수시로 확인할 때나, 원하는 포맷으로 필드들을 출력하고자 할 때 사 
	@Override
	public String toString() {
		
		String str = "byteField 값 : " + byteField + "   shortField 값 : " +  shortField
				+ "  intField 값 : " +  intField;
		
		return str;
	}
	

}
