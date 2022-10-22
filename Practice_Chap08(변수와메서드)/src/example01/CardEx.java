package example01;

public class CardEx {

	public static void main(String[] args) {
		
		
		Card card1 = new Card();
		
		card1.setColor("yellow");
		card1.setCompany("국민");
		
		System.out.println(card1);
		card1.show();
		
		Card.width = 80;
		Card.height = 150;
		
		
		Card card2 = new Card();
		
		card2.setColor("blue");
		card2.setCompany("농협");
		
		System.out.println(card2);
	}
	

}
