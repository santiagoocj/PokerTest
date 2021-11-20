package co.com.ies.pruebas;

public enum WinnerHandType {

    CARTA_ALTA("Carta alta");

    private String desc;

    WinnerHandType(String desc) {
        this.desc = desc;
    }

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}    
}
