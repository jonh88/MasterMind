package es.upm.miw.iwvg;

public class Demo extends Juego {
			
	public Demo() {
		
		super();
		
	}	

	@Override
	public Color[] consigueIntento() {

		Color[] intento = this.generarCodigoAleatorio();		 
		return intento;
		
	}
		
}
