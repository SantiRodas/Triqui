/*
 * SANTIAGO RODAS RODRIGUEZ
 * PROYECTO PERSONAL
 * JUEGO TRIQUI
 */

package model;

import java.util.ArrayList;
import java.util.Collections;

public class Juego {
	
	// ----------------------------------------------------------------------------
	
	private ArrayList <Jugador> jugadores;
	
	// ----------------------------------------------------------------------------

	public Juego() {

		jugadores = new ArrayList<Jugador>();
		
	}
	
	// ----------------------------------------------------------------------------

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	
	// ----------------------------------------------------------------------------

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	// ----------------------------------------------------------------------------

	public void ordenar() {
		
		Collections.sort(jugadores);
		
	}
	
	// ----------------------------------------------------------------------------
		
}
