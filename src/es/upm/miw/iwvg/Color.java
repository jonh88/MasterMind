package es.upm.miw.iwvg;

public enum Color {
	
	AMARILLO("A-amarillo"),
	ROJO("R-rojo"),
	VERDE("V-verde"),
	AZUL("Z-azul"),
	BLANCO("B-blanco"),
	NEGRO("N-negro");
	
	private String value;
	public static final int NUMCOLORES = 6;
	
	private Color (String value) {
		this.value = value;
	}
	
	public String toString() {
		return this.value;
	}
	
	public static String obtenerColores() {
		return AMARILLO.value+", "+ROJO.value+", " +VERDE.value+", "+AZUL.value+", " +BLANCO.value+", "+NEGRO.value;
	}
	

}
