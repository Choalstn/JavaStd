package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		//score는 참조변수 
		//score는 5개의 방을 heap에 생성 (20byte)
		int[] score = new int[5];
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();
		
		score[0] = 100;
		
		//배열에 값 대입
		for(int i=0; i<score.length; i++) {
			score[i] = i+10;
		}
		
		//배열 값 출력 
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		
		

	}

}
