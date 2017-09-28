package es.upm.miw.iwvg;

import es.upm.miw.iwvg.utils.Io;

public class PedirIntentoController extends Controller{

	Juego juego;
	
	public PedirIntentoController(Juego juego){				
		super(juego);
	}
	
	@Override
	public void control() {
		Io comunicador = new Io();
		
		this.juego.play();
		
		if (this.juego.getTablero().isVictoria()) {
			comunicador.escribeMensaje("*********** ENHORABUENA HAS ACERTADO EL CODIGO SECRETO ************");
		}else {
			comunicador.escribeMensaje("Lo sentimos, pero no has acertado el codigo secreto...");
		}
		
		this.juego.setState(State.PARTIDA_FINALIZADA);
	}
}
