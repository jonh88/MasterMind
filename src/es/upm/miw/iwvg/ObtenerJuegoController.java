package es.upm.miw.iwvg;

import es.upm.miw.iwvg.utils.Io;

public class ObtenerJuegoController {		
	
	public ObtenerJuegoController () {
		
	}
	
	public Juego dameTipoJuego() {
		Io comunicador = new Io();
		
		comunicador.escribeMensaje("********** BIENVENIDO A MASTERMIND **********");
		comunicador.escribeMensaje("Por favor elija un tipo de juego:");
		comunicador.escribeMensaje("\t 1. Partida");
		comunicador.escribeMensaje("\t 2. Demo");
		
		String entradaUsuario = comunicador.leer();			 		
							
		if (entradaUsuario.equals("1")) {
			Partida nuevaPartida = new Partida();
			comunicador.escribeMensaje("Secreto: ****");
			return nuevaPartida;
		}else {
			Demo nuevaDemo = new Demo();
			comunicador.escribeMensaje("Secreto: ****");
			return nuevaDemo;
		}				
		
	}

}
