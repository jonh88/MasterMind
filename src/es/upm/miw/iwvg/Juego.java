package es.upm.miw.iwvg;

import java.util.Random;
import es.upm.miw.iwvg.utils.Io;

public abstract class Juego {
		
	private Tablero tablero;		
	private static final int LONGITUDCODIGO = 4;
	private static final int NUMERO_INTENTOS = 2;
	
	public Juego() {
				
		this.tablero = new Tablero(this.generarCodigoAleatorio());
		
	}
	
	protected Color[] generarCodigoAleatorio() {
					
		Color colores[] = Color.values();
		Color codigoAleatorio[] = new Color[LONGITUDCODIGO];
		Random generadorNumeroAleatorio = new Random();
		for (int i=0; i< LONGITUDCODIGO; i++) {
			int numAleatorio = generadorNumeroAleatorio.nextInt(Color.NUMCOLORES) +1;
			codigoAleatorio[i]= colores[numAleatorio-1];			
		}			
		
		return codigoAleatorio;		
	}	
	
	public boolean play() {
		
		Io comunicador = new Io();
		int jugada = 0;
		while (jugada < NUMERO_INTENTOS && !this.tablero.isVictoria()) {
			
			comunicador.escribeMensaje("Intento? "+"[cuatro letras de entre "+Color.obtenerColores()+"]");
			Color[] intento = this.consigueIntento();		
			int[] resultado = this.tablero.validarIntento(intento);
			comunicador.escribeMensaje(resultado[0]+" muertos y "+resultado[1]+" heridos");
			jugada++;
			
		}
		
		return this.tablero.isVictoria();		
	}
	
	public void pintaCodigoSecreto() {
		Io comunicador = new Io();
		comunicador.escribeMensajeUnaLinea("Secreto: ");
		for (int i = 0; i < LONGITUDCODIGO -1;i++) {
			comunicador.escribeMensajeUnaLinea("*");
		}
		comunicador.escribeMensaje("*");
		
	}
	
	public abstract Color[] consigueIntento();
	
}
