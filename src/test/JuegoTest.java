/*
 * SANTIAGO RODAS RODRIGUEZ
 * PROYECTO PERSONAL
 * JUEGO TRIQUI
 */

package test;

import org.junit.jupiter.api.Test;
import model.Juego;
import model.Jugador;

class JuegoTest {
	
	// ----------------------------------------------------------------------------
	
	Juego juego;
	
	// ----------------------------------------------------------------------------
	
	public void setup1() {
		
		juego = new Juego();
		
	}
	
	// ----------------------------------------------------------------------------
	
	public void setup2() {
		
		setup1();
		
		juego.getJugadores().add(new Jugador("Santiago", 1));
		
		juego.getJugadores().add(new Jugador("Erika", 3));
		
		juego.getJugadores().add(new Jugador("Valentina", 5));
		
	}
	
	// ----------------------------------------------------------------------------
	
	@Test
	public void ordenar() {
		
		setup2();
		
		juego.ordenar();
		
		for(int i = 0 ; i < juego.getJugadores().size() ; i ++) {
			
			System.out.println(juego.getJugadores().get(i).getNombre());
			
			System.out.println(juego.getJugadores().get(i).getPartidas());
			
			System.out.println();
			
		}
		
	}
	
	// ----------------------------------------------------------------------------

}
