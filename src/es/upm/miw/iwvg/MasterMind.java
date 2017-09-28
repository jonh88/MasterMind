package es.upm.miw.iwvg;

public class MasterMind {
		
	private ObtenerJuegoController obtenerJuegoController;	
	private ContinuaController continuaController;
	private PedirIntentoController finPartidaController;
	private Logica logic;	
	
	public MasterMind() {
//		this.obtenerJuegoController = new ObtenerJuegoController(tipoJuego);
//		this.finPartidaController = new FinPartidaController();
//		this.continuaController = new ContinuaController();
		this.logic = new Logica();
	}
	
	public void start() {				
		
		Controller controller;
		do {			
			
			controller = logic.getController();
			if (controller != null) {
				controller.control();
			}			
			
		}while (controller!= null);								
		
	}	

}
