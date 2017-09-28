package es.upm.miw.iwvg;

public class MasterMind {
		
	private ObtenerJuegoController obtenerJuegoController;	
	private ContinuaController continuaController;
	private FinPartidaController finPartidaController;
	private Juego tipoJuego;	
	
	public MasterMind() {
		this.obtenerJuegoController = new ObtenerJuegoController();
		this.finPartidaController = new FinPartidaController();
		this.continuaController = new ContinuaController();
	}
	
	public void start() {				
		
		do {
			this.tipoJuego = this.obtenerJuegoController.dameTipoJuego();	
			boolean victoria = this.tipoJuego.play();
			
			if (victoria) {
				finPartidaController.felicita();
			}else {
				finPartidaController.anima();
			}
			
		}while (continuaController.preguntarSicontinua());								
		
	}	

}
