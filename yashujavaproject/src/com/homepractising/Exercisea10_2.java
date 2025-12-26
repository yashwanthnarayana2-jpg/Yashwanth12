package com.homepractising;

class Card {
	String invite;
	 char guest;

	Card(String invite) {
		this.invite = invite;
	}
	Card( char guest) {
		this.guest = guest;
	}
	

	Card(Card c) {
		this.invite = c.invite;
	}
}

class Together {
	String bride;
	String groom;
	String venue;
	 String date;
	final Card card;

	Together(String bride, String groom, String venue,  String date, final Card card ) {
		this.bride = bride;
		this.groom = groom;
		this.venue = venue;
		this.date = date;
		this.card = card;
	}
 

	Together(Together t) {
		this.bride = t.bride;
		this.groom = t.groom;
		this.venue = t.venue;
		this.date = t.date;
		this.card = new Card(t.card);// deep
	}
	void show() {
		System.out.println(bride);
		System.out.println(groom);
		System.out.println(venue);
		System.out.println(date);
		System.out.println(card.invite);
		 
	}


}

public class Exercisea10_2 {

	public static void main(String[] args) {
		Card c = new Card("kalyanam");
 Together t = new Together("sri.  VENKATESWARA SWAMI", "smt. GODHADEVI ", "TTD temple vizag", "14-1-2026", c);
		t.show();
		System.out.println();
		Together t1 = new Together(t);
		t1.card.invite="'kalyanam'";
		t1.show();
		System.out.println( );
	}

}
