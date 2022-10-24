package example04;

import java.util.Arrays;

class Data {
	int data;
}

public class ReferenceReturnClassEx {

	public static void main(String[] args) {
		
		Data ori = new Data();
		ori.data = 100;
		Data cloned = copy(ori);
		System.out.println(cloned.data);
		

	}
	
	public static Data copy(Data d) {
		Data cloned = new Data();
		cloned.data = d.data;
		
		return cloned; //Data 클래스의 주소를 넘기고 있음 
	}

}
