package es.upm.miw.iwvg;

public class Logica {
	
	private Juego juego;
	
	ObtenerJuegoController obtenerJuegoController;
	
	FinPartidaController finPartidaController;
	
	ContinuaController continuaControler;
	
	public Logica () {
		this.obtenerJuegoController = new ObtenerJuegoController(this.juego);
		this.finPartidaController = new FinPartidaController(this.juego);
	}

}
