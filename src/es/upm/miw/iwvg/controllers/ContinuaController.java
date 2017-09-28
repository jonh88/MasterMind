package es.upm.miw.iwvg.controllers;

import es.upm.miw.iwvg.modelos.Juego;
import es.upm.miw.iwvg.modelos.State;
import es.upm.miw.iwvg.utils.Io;

public class ContinuaController extends Controller{
	
	Juego juego;
	
	public ContinuaController(Juego juego) {
		super(juego);
	}
	
	@Override
	public void control() {
		Io comunicador = new Io();
		
		comunicador.escribeMensaje("¿Desea continuar jugando? (yes/no)");		
		String respuesta = comunicador.leer();
					
		if (respuesta.equals("yes")||respuesta.equals("y")) {
			this.juego.setState(State.PIDIENDO_JUEGO);
		}else if (respuesta.equals("no")||respuesta.equals("n")) {
			this.juego.setState(State.FIN_JUEGO);
		}
		
	}

}
