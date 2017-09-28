package es.upm.miw.iwvg;

import es.upm.miw.iwvg.utils.Io;

public class Partida extends Juego {		
	
	public Partida() {
		
		super();
		
	}
	
	@Override
	public Color[] consigueIntento() {
		
		Io comunicador = new Io();
			
		String intento = comunicador.leer();
						
		assert intento != null;
		return convertirCodigo(intento);
		
	}
	
	private Color[] convertirCodigo(String code) {
		assert code.length() == 4;
		
		Color[] codigoResultado = new Color[4];
		for (int i = 0; i < code.length();i++) {
			switch (code.charAt(i)) {
				case 'A':
					codigoResultado[i]= Color.AMARILLO;
					break;
				case 'R':
					codigoResultado[i]= Color.ROJO;
					break;
				case 'V':
					codigoResultado[i]= Color.VERDE;
					break;
				case 'Z':
					codigoResultado[i]= Color.AZUL;
					break;
				case 'B':
					codigoResultado[i]= Color.BLANCO;
					break;
				case 'N':
					codigoResultado[i]= Color.NEGRO;
					break;					
			}
		}
		return codigoResultado;
	}

}
