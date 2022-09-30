package example03;

public class VariableArrayEx {

	public static void main(String[] args) {
		
		//가변 배열 연습
		
		int[][] array = {
				{95, 86, 100, 55},
				{83, 92, 96},
				{78, 83, 93, 87, 88, 77, 10}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double)sum / count;
		System.out.println("가변 배열의 합계(sum) : " + sum);
		System.out.printf("기변 배열의 평균(avg) : %.1f", avg);

	}

}
