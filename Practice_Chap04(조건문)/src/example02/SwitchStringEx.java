package example02;

public class SwitchStringEx {

	public static void main(String[] args) {
		
		String str = "부장";
		
		
		switch(str) {
			case "부장" :
				System.out.println("450만");
				break;
				
			case "차장" :
				System.out.println("400만");
				break;
				
			case "과장" :
				System.out.println("350만");
				break;
				
			case "대리" :
				System.out.println("300만");
				break;
				
			case "사원" :
				System.out.println("250만");
				break;
				
		default :
			System.out.println("없는 직급이내요");
 		}
		
	}

}
