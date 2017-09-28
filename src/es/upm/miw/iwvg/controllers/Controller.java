package es.upm.miw.iwvg.controllers;

import es.upm.miw.iwvg.modelos.Game;
import es.upm.miw.iwvg.modelos.State;

public abstract class Controller {
	
	private Game game;		
	
	protected Controller(Game game) {
		 
		assert game != null;
		this.game = game;
		
	}
	
	public abstract void control();
	
	protected State getState() {
		
		return this.game.getState();
		
	}
	
	protected void setState(State state) {
		
		assert state != null;
		this.game.setState(state);
		
	}

	public Game getGame() {
		
		return game;
		
	}

	public void setGame(Game game) {
		
		this.game = game;
		
	}
		
}