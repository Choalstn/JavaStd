package example04;

public class CarEx {

	public static void main(String[] args) {
		
		Car c = new Car(80);
		c.speedUp();
		c.speedDown();
		c.stop();
		
		System.out.println("");
		
		SportCar sc = new SportCar(150);
		sc.speedUp(); //조상클래스의 speedUp 호출 
		sc.speedDown();
		sc.stop();
		

	}

}
