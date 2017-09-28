package es.upm.miw.iwvg.controllers;

import es.upm.miw.iwvg.modelos.Game;
import es.upm.miw.iwvg.modelos.State;
import es.upm.miw.iwvg.utils.Io;

public class PedirIntentoController extends Controller{
	
	public PedirIntentoController(Game game){				
		super(game);
	}
	
	@Override
	public void control() {
		Io comunicador = new Io();
		
		this.getGame().playGame();
		
		if (this.getGame().getTablero().isVictoria()) {
			comunicador.escribeMensaje("*********** ENHORABUENA HAS ACERTADO EL CODIGO SECRETO ************");
		}else {
			comunicador.escribeMensaje("Lo sentimos, pero no has acertado el codigo secreto...");
		}
		
		this.getGame().setState(State.PARTIDA_FINALIZADA);
	}
}
