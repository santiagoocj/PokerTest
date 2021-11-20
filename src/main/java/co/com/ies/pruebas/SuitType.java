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

}
