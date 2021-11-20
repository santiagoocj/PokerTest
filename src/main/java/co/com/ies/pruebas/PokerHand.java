package co.com.ies.pruebas;

public class PokerHand {
	
	private static final int SIZE_OF_POKERHAND = 5;
	
	Card[] cards = new Card[SIZE_OF_POKERHAND];
	
	public PokerHand(String[] cards) {
		for(int i=0; i<cards.length; i++) {
			this.cards[i] = Card.typeOfCard(cards[i]);
		}
	}

    public static PokerHand of(String separadoEspacios){
        return new PokerHand(separadoEspacios.split(" "));
    }
    
    public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
}
