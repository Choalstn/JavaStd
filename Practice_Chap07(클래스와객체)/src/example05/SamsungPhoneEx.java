package example05;

public class SamsungPhoneEx {

	public static void main(String[] args) {
		
		SamsungPhone sam1 = new SamsungPhone();
		SamsungPhone sam2 = new SamsungPhone();
		
		sam1.setCompany("삼성");
		sam1.setModel("갤럭시z플립");
		sam1.setRelease(2022);
		sam1.setColor("purple");
		
		System.out.println(sam1);
		
		sam2.setCompany("LG");
		sam2.setModel("G6");
		sam2.setRelease(2017);
		sam2.setColor("black");
		
		System.out.println(sam2);

	}

}
