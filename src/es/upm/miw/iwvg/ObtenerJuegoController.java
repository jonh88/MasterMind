package es.upm.miw.iwvg;

import es.upm.miw.iwvg.utils.Io;

public class ObtenerJuegoController extends Controller {
	
	Juego juego;
	
	public ObtenerJuegoController (Juego juego) {
		super(juego);
	}
	
	public Juego getJuego() {
		return juego;
	}

	@Override
	public void control() {
		
		Io comunicador = new Io();
		
		comunicador.escribeMensaje("********** BIENVENIDO A MASTERMIND **********");
		comunicador.escribeMensaje("Por favor elija un tipo de juego:");
		comunicador.escribeMensaje("\t 1. Partida");
		comunicador.escribeMensaje("\t 2. Demo");
		
		String entradaUsuario = comunicador.leer();			 		
							
		if (entradaUsuario.equals("1")) {
			Partida nuevaPartida = new Partida();
			comunicador.escribeMensaje("Secreto: ****");
			this.juego = nuevaPartida;
		}else {
			Demo nuevaDemo = new Demo();
			comunicador.escribeMensaje("Secreto: ****");
			this.juego = nuevaDemo;
		}
		
		this.setState(State.JUGANDO);
		
	}

}
