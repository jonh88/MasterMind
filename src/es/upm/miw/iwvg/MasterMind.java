package es.upm.miw.iwvg;

import es.upm.miw.iwvg.controllers.ContinuaController;
import es.upm.miw.iwvg.controllers.Controller;
import es.upm.miw.iwvg.controllers.Logica;
import es.upm.miw.iwvg.controllers.ObtenerJuegoController;
import es.upm.miw.iwvg.controllers.PedirIntentoController;

public class MasterMind {
		
	private ObtenerJuegoController obtenerJuegoController;	
	private ContinuaController continuaController;
	private PedirIntentoController finPartidaController;
	private Logica logic;	
	
	public MasterMind() {
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
