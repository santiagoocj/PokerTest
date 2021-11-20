package co.com.ies.pruebas;

public enum ValueType {
	
	DOS("2"),
	TRES("3"),
	CUATRO("4"),
	CINCO("5"),
	SEIS("6"),
	SIETE("7"),
	OCHO("8"),
	NUEVE("9"),
	DIEZ("10"),
	JOTA("J"),
	REINA("Q"),
	REY("K"),
	AS("A");
	
	private String value;
	
	private ValueType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
