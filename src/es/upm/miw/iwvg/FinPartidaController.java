package es.upm.miw.iwvg;

import es.upm.miw.iwvg.utils.Io;

public class FinPartidaController {

	public FinPartidaController(){				
		
	}
	
	public void felicita() {
		Io comunicador = new Io();
		comunicador.escribeMensaje("*********** ENHORABUENA HAS ACERTADO EL CODIGO SECRETO ************");
	}
	
	public void anima() {
		Io comunicador = new Io();
		comunicador.escribeMensaje("Lo sentimos, pero no has acertado el codigo secreto...");
	}
}
