package example01;

public class ForEx02 {

	public static void main(String[] args) {
		
	int sum=0;
	int temp=0;
	
	//누적합계가 2000일 때 i의 값 출럭  
	for(int i=1; i<=100; i++) {
			sum += i;
			
			if(sum>=2000) {
				temp = i;
				break;	
			}
			
	}
		
		System.out.println("2000이상일 때 sum의 값 : " + sum);
		System.out.println("2000이상일 때 i의 값 : " + temp);

	}

}
