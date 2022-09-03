package example03;

public class RandomEx {

	public static void main(String[] args) {
		
		//Math.random의 값은 0.00000 ~ 0.99999 사이의 값을 발생시킴   
		//double 형식  
		System.out.println(Math.random());
		
		int num = (int)(Math.random()*6)+1; //1~6까지 
		
		System.out.println(num);
		
		
		//if문
		if(num == 1) {
			System.out.println("1이 나왔네요");
		}
		else if(num == 2) {
			System.out.println("2가 나왔네요");
		}
		else if(num == 3) {
			System.out.println("3이 나왔네요");
		}
		else if(num == 4) {
			System.out.println("4가 나왔네요");
		}
		else if(num == 5) {
			System.out.println("5가 나왔네요");
		}
		else if(num == 6) {
			System.out.println("6가 나왔네요");
		}
		
		
		//switch문
		switch(num) {
			case 1 :
				System.out.println("1이 나왔네요");
				break;
			
			case 2 :
				System.out.println("2가 나왔네요");
				break;
				
			case 3 :
				System.out.println("3이 나왔네요");
				break;
				
			case 4 :
				System.out.println("4가 나왔네요");
				break;
				
			case 5 :
				System.out.println("5가 나왔네요");
				break;
				
			case 6 :
				System.out.println("6이 나왔네요");
				break;
		}

	}

}
