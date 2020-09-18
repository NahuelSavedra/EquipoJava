package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class OrdenPorNumeroCamiseta implements Comparator <Jugador> {

	@Override
	public int compare(Jugador jugador1, Jugador jugador2) {
		return jugador1.getNumero().compareTo(jugador2.getNumero());
	}
		

}
