package es.upm.miw.iwvg.modelos;

import es.upm.miw.iwvg.utils.Io;

public abstract class Juego {
			
	public Juego() {}
			
	public Color[] play() {
		
		Io comunicador = new Io();
			
		comunicador.escribeMensaje("Intento? "+"[cuatro letras de entre "+Color.obtenerColores()+"]");
		return this.consigueIntento();
					
	}	
	
	public abstract Color[] consigueIntento();
	
}
