package es.upm.miw.iwvg.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import es.upm.miw.iwvg.modelos.Color;

public class Io {
	
	private BufferedReader bufferedReader;
	
	public Io() {
		
		this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	public Io(InputStreamReader inputData) {
		
		this.bufferedReader = new BufferedReader(inputData);
		
	}
	
		
	public String leer() {
		
		try {
			
			return this.bufferedReader.readLine();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
			
		}
	}				

	public void escribeMensaje(String mensaje) {
		
		System.out.println(mensaje);
		
	}
	
	public void escribeMensajeUnaLinea(String mensaje) {
		
		System.out.print(mensaje);
		
	}
}
