package example02;

public class SwitchEx {

	public static void main(String[] args) {
		
		int score = 95;
		
		//int이하의 정수값 or string
		switch(score/10) {
			case 10 : 
				System.out.println("100점 !!");
				break;
			
			case 9 : 
				System.out.println("90점 이상");
				break;
				
			case 8 : 
				System.out.println("93점입니다.");
				break;
				
			default :
				System.out.println("잘못된 값입니다.");
		}
	}

}
