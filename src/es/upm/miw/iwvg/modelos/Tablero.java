package es.upm.miw.iwvg.modelos;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
	
	private Color[] codigoSecreto;
	private List<Color[]> intentos;
	private List<int[]> resultados;
	private boolean victoria;
	
	public Tablero(Color[] codigoSecreto) {
		this.codigoSecreto = codigoSecreto;
		this.intentos = new ArrayList<Color[]>();
		this.resultados = new ArrayList<int[]>();
		this.victoria = false;
	}
	
	public int[] validarIntento(Color[] intento) {
		
		this.intentos.add(intento);
		int[] resultado = new int[2];
		
		resultado[0] = 2;
		resultado[1] = 1;
		
		this.resultados.add(resultado);
		
		return resultado;
				
	}
	
	public boolean isVictoria() {
		return this.victoria;
	}
	

}
