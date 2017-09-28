package es.upm.miw.iwvg;

public class Logica {
		
	private Juego juego;
	
	ObtenerJuegoController obtenerJuegoController;
	
	PedirIntentoController pedirIntentoController;
	
	ContinuaController continuaController;
	
	public Logica () {
		this.obtenerJuegoController = new ObtenerJuegoController(this.juego);
		this.juego = obtenerJuegoController.getJuego();
		this.pedirIntentoController = new PedirIntentoController(this.juego);
		this.continuaController = new ContinuaController(this.juego);			
	}
	
	public Controller getController() {
		switch(juego.getState()) {
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
