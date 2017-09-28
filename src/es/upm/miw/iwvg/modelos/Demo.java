package es.upm.miw.iwvg.modelos;

import es.upm.miw.iwvg.utils.GeneradorCodigos;

public class Demo extends Juego {
			
	public Demo() {
		
		super();
		
	}	

	@Override
	public Color[] consigueIntento() {

		Color[] intento = new GeneradorCodigos().generarCodigoAleatorio(); 
		return intento;
		
	}
		
}
