package es.upm.miw.iwvg.utils;

import java.util.Random;

import es.upm.miw.iwvg.modelos.Color;

public class GeneradorCodigos {
	
	private static final int LONGITUDCODIGO = 4;
	
	public GeneradorCodigos(){
		
	}
	
	public Color[] generarCodigoAleatorio() {
		
		Color colores[] = Color.values();
		Color codigoAleatorio[] = new Color[LONGITUDCODIGO];
		Random generadorNumeroAleatorio = new Random();
		for (int i=0; i< LONGITUDCODIGO; i++) {
			
			int numAleatorio = generadorNumeroAleatorio.nextInt(Color.NUMCOLORES) +1;
			codigoAleatorio[i]= colores[numAleatorio-1];
			
		}			
		
		return codigoAleatorio;		
	}
	
	
}