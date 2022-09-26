package example02;

public class SecondArrayEx02 {

	public static void main(String[] args) {
		
		int[][] score = new int[][] {
			{100,70,50},
			{70,50,30},
			{50,80,70},
			{55,85,77},
			{100,85,70}
		};
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		int totalSum = 0;
		double totalAvg = 0.0;
		
		System.out.println("번호		국어		영어		수학		총점		평균");
		System.out.println("====================================================================================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0; //개인별 총점 
			double avg = 0.0; //개인별 평균 
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print(" "+ (i+1));
			System.out.print("		");
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j]);
				System.out.print("		 ");
			}
			
			totalSum += sum; //총 합계 
			avg = (double)sum / score[i].length;
			totalAvg += avg;
			
			System.out.print(sum);
			System.out.print("		");
			//System.out.println(avg);
			//printf() %d <- 형식 지정자의 갯수만큼 그에 대입되는 변수가 , 구분되어 제시
			System.out.printf("%.1f", avg);
			System.out.println();
	
			
		}
		
		totalAvg /= score.length;
		
		System.out.println("");
		System.out.printf("총점		%d		%d		%d		%d		%.1f" , korTotal, engTotal, mathTotal, totalSum, totalAvg );

	}

}
