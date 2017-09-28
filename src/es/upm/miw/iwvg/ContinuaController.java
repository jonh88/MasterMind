package es.upm.miw.iwvg;

import es.upm.miw.iwvg.utils.Io;

public class ContinuaController {
	
	public ContinuaController() {
		
	}
	
	public boolean preguntarSicontinua() {
		Io comunicador = new Io();
		
		comunicador.escribeMensaje("¿Desea continuar jugando? (yes/no)");		
		String respuesta = comunicador.leer();
					
		if (respuesta.equals("yes")||respuesta.equals("y")) {
			return true;
		}else if (respuesta.equals("no")||respuesta.equals("n")) {
			return false;
		}else {
			return false;
		}		
		
	}

}
