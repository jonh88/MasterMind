package es.upm.miw.iwvg;

public abstract class Controller {
	
	private Juego juego;	
	
	
	protected Controller(Juego juego) {
		assert juego != null;
		this.juego = juego;
	}
	
	public abstract void control();
	
	protected State getState() {
		return jugada.getState();
	}
	
	protected void setState(State state) {
		assert state != null;
		this.jugada.setState(state);
	}
}
