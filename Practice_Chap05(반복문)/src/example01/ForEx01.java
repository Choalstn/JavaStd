package example01;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum=0;
		
		//1부터 100까지 합  
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1에서 100까지의 합 : " + sum);
		
	}

}
