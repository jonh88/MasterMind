package es.upm.miw.iwvg;

import es.upm.miw.iwvg.controllers.Controller;
import es.upm.miw.iwvg.controllers.Logica;


public class MasterMind {
			
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
	
	public static void main(String[] args) {
		
		new MasterMind().start();
		
	}

}
