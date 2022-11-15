package example01;

//상속의 이유 : 공통된 코드는 조상에서 관리, 개별적인 부분은 자손에서 관리 | 코드의 재사용성 
//상속은 직접적 관계이다. 
public class MountainBicycle extends Bicycle {
	
	//멤버 갯수 : 5개 
	String frame;
	int gear;
	int price;
	
	public void print() {
		System.out.println("id: " + this.id);
		System.out.println("brand : " + this.brand);
		System.out.println("frame : " + this.frame);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
	}
	
	public static void main(String[] args) {
		 MountainBicycle m = new MountainBicycle();
		 
		 m.id = 1203;
		 m.brand = "LESPO";
		 m.frame = "알루미늄";
		 m.gear = 3;
		 m.price = 1000;
		 
		 m.print();
	}
	

}
