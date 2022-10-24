package example04;

public class ReferenceParamArrayEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10,20,30,40,50};
		System.out.println("change() 호출 전 : " + arr[0]);
		System.out.println("main()내 arr 주소 값 : " + arr);
		change(arr);
		//change(new int[] {10,20,30}) 이것도 가능 
		System.out.println("change() 호출 후 : " + arr[0]);
		

	}
	
	public static void change(int[] arr) {
		System.out.println("change()내 arr 주소 값 : " + arr);
		arr[0] = 999;
		System.out.println("change()내의 값 : " + arr[0]);
		return;
	}

}
