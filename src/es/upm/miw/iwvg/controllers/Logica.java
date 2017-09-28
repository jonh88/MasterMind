package es.upm.miw.iwvg.controllers;

import es.upm.miw.iwvg.modelos.Game;

public class Logica {
		
	private Game game;
	
	ObtenerJuegoController obtenerJuegoController;
	
	PedirIntentoController pedirIntentoController;
	
	ContinuaController continuaController;
	
	public Logica () {
		this.game = new Game();
		this.obtenerJuegoController = new ObtenerJuegoController(this.game);		
		this.pedirIntentoController = new PedirIntentoController(this.game);
		this.continuaController = new ContinuaController(this.game);			
	}
	
	public Controller getController() {
		switch(this.game.getState()) {
		case PIDIENDO_JUEGO:
			return this.obtenerJuegoController;			
		case JUGANDO:
			return this.pedirIntentoController;			
		case PARTIDA_FINALIZADA:
			return this.continuaController;			
		default:
			return null;
		}
	}
	
	

}
