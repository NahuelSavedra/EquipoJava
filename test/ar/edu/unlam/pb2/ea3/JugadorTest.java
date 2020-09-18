package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JugadorTest {
	@Test
	public void queUnJugadorSeaIgualAOtroPorSuNombre() {
		Jugador j1 = new Jugador(10,"Leo Messi",100000000);
		Jugador j2 = new Jugador(3,"Leo Messi",300000000);
		
		assertEquals(j1.getNombre(),j2.getNombre());
	}
}
