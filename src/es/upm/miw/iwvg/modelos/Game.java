package es.upm.miw.iwvg.modelos;

import es.upm.miw.iwvg.utils.GeneradorCodigos;
import es.upm.miw.iwvg.utils.Io;

public class Game {
	
	private Juego juego;
	private State state;
	private Tablero tablero;
	
	private static final int NUMERO_INTENTOS = 2;
	
	public Game() {
		this.state = State.PIDIENDO_JUEGO;
		this.tablero = new Tablero(new GeneradorCodigos().generarCodigoAleatorio());
	}		
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void playGame() {
		assert this.juego != null;
		Io comunicador = new Io();
				
		int jugada = 0;
		while (jugada < NUMERO_INTENTOS && !this.tablero.isVictoria()) {
			Color[] intento = this.juego.play();
			
			int[] resultado = this.tablero.validarIntento(intento);
			comunicador.escribeMensaje(resultado[0]+" muertos y "+resultado[1]+" heridos");
			jugada++;
		}
		
	}
		

}
