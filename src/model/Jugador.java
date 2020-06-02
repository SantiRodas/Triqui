/*
 * SANTIAGO RODAS RODRIGUEZ
 * PROYECTO PERSONAL
 * JUEGO TRIQUI
 */

package model;

public class Jugador implements Comparable<Jugador> {
	
	// ----------------------------------------------------------------------------
	
	private String nombre;
	
	private int partidas;
	
	// ----------------------------------------------------------------------------

	public Jugador(String nombre, int partidas) {

		this.nombre = nombre;
		
		this.partidas = partidas;
		
	}
	
	// ----------------------------------------------------------------------------

	public int getPartidas() {
		return partidas;
	}
	
	public void setPartidas(int partidas) {
		this.partidas = partidas;
	}

	// ----------------------------------------------------------------------------

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	// ----------------------------------------------------------------------------

	@Override
	public int compareTo(Jugador o) {
		
		if(o.getPartidas() > partidas){
			
            return 1 ;
            
        }else if(o.getPartidas() > partidas){
        	
            return 0 ;
            
        }else{
        	
            return - 1 ;
            
        }
		
	}
	
	// ----------------------------------------------------------------------------
	
}
