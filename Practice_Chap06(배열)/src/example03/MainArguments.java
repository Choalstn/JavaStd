package example03;

public class MainArguments {

	public static void main(String[] args) {
		
		//메인 메서드의 매개변수의 활용하는 방법 
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("아이디 입력 패스워드 입력");
		}
		
		String str1 = args[0];
		String str2 = args[1];
		System.out.println("id : " + str1);
		System.out.println("password : " + str2);
		
		int count = Integer.parseInt(str1);
		int total = count + 500;
		System.out.println("count 값 : " + count);
				

	}

}
