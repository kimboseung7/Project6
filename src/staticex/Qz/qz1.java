package staticex.Qz;

public class qz1 {

	public static void main(String[] args) {
		Card card1 = new Card();
		card1.showInfo();
		
		Card card2 = new Card();
		card2.showInfo();
		
		Card card3 = new Card();
		card3.showInfo();
	}

}

class Card {
	static int serialNum = 100;
	int cardID;

	public Card() {
		this.cardID = serialNum;
		serialNum++; // 카드가 생성될 때마다 증가
	}

	public void showInfo() {
		System.out.println("카드번호:" + cardID);
	}

}