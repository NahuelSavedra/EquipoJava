package ar.edu.unlam.pb2.ea3;

public class JugadorDuplicadoException extends Exception {
	public JugadorDuplicadoException() {
		super("No puede haber jugadores con el mismo nombre en el equipo");
	}
}
