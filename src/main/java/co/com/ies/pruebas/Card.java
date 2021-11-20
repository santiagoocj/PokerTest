package co.com.ies.pruebas;

public class Card {
	
	private static final int POSITION_VALUE_IN_POKERHAND = 0; 
	private static final int POSITION_SUIT_IN_POKERHAND = 1; 
	
	private SuitType suit;
	private ValueType value;
	
	public Card(SuitType suit, ValueType value) {
		this.suit = suit;
		this.value = value;
	}
	
	public SuitType getSuit() {
		return suit;
	}
	public void setSuit(SuitType suit) {
		this.suit = suit;
	}
	public ValueType getValue() {
		return value;
	}
	public void setValue(ValueType value) {
		this.value = value;
	}
	
	public static Card typeOfCard(String card) {
		StringBuilder suitBuilder = new StringBuilder();
		suitBuilder.append(card.charAt(POSITION_SUIT_IN_POKERHAND));
		StringBuilder valueBuilder = new StringBuilder();
		valueBuilder.append(card.charAt(POSITION_VALUE_IN_POKERHAND));
		SuitType suitSelect = getSuitType(suitBuilder.toString());
		ValueType valueSelect = getValueType(valueBuilder.toString());
		return new Card(suitSelect, valueSelect);
	}
	
	private static SuitType getSuitType(String suit) {
		for (SuitType suitSelect: SuitType.values()){
			if(suitSelect.getSuit().equals(suit)) {
				return suitSelect;
			}
		}
		return null;
	}
	
	private static ValueType getValueType(String value) {
		for(ValueType valueSelect: ValueType.values()) {
			if(valueSelect.getValue().equals(value)) {
				return valueSelect;
			}
		}
		return null;
	}
}
