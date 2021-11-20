package co.com.ies.pruebas;

public enum SuitType {
	
	TREBOL("C"),
	DIAMANTE("D"),
	CORAZON("H"),
	ESPADA("S");
	
	private String suit;
	
	private SuitType(String suit) {
		this.suit = suit;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
}
