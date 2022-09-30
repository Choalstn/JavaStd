package example03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] original = new int[] {10,77, 33, 50};
		int[] target = new int[10];
		int count = 0;
		
		System.out.println("복사하기 전");
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(target));
		
		System.out.println("복사한 후");
		
		//for문을 이용해서 직접 복사 하는 방법 
		//for(int i : original) {
		//	target[count++] = i;
		//}
		
		//어디서, 몇번부터, 어디에, 몇번부터, 길이 
		//System.arraycopy(original, 0, target, 5, original.length);
		target = Arrays.copyOf(original, original.length);
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(target));

	}

}
