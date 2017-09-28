package es.upm.miw.iwvg.controllers;

import es.upm.miw.iwvg.modelos.Juego;
import es.upm.miw.iwvg.modelos.State;

public abstract class Controller {
	
	private Juego juego;	
	
	
	protected Controller(Juego juego) {
		assert juego != null;
		this.juego = juego;
	}
	
	public abstract void control();
	
	protected State getState() {
		return juego.getState();
	}
	
	protected void setState(State state) {
		assert state != null;
		this.juego.setState(state);
	}
}
