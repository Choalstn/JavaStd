package example01;

public class If_else_Ex {

	public static void main(String[] args) {
		
		int score = -93;
		
		//수십개의 if문이 존재하더라고 cpu는 모든 if문을 참조 (비효율적 코드)  
//		if(score > 90) {
//			System.out.println("점수가 90점보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		}
		
//		if(score > 80) {
//			System.out.println("점수가 80점보다 큽니다.");
//		}
		
		
		//if-else 구문은 50%의 확률일 때 사용이 바람직  
		if(score > 90) {
			System.out.println("90점 이상");
		} else {
			System.out.println("90점 미만");
		}

	}

}
