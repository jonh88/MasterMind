package es.upm.miw.iwvg.controllers;

import es.upm.miw.iwvg.modelos.Demo;
import es.upm.miw.iwvg.modelos.Game;

import es.upm.miw.iwvg.modelos.Partida;
import es.upm.miw.iwvg.modelos.State;
import es.upm.miw.iwvg.utils.Io;

public class ObtenerJuegoController extends Controller {		
	
	public ObtenerJuegoController (Game game) {
		super(game);
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
			this.getGame().setJuego(nuevaPartida);
		}else {
			Demo nuevaDemo = new Demo();
			comunicador.escribeMensaje("Secreto: ****");
			this.getGame().setJuego(nuevaDemo);
		}
		
		this.setState(State.JUGANDO);
		
	}

}
