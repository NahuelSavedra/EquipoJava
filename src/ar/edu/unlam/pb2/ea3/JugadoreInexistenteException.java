package ar.edu.unlam.pb2.ea3;

public class JugadoreInexistenteException extends Exception {
	public JugadoreInexistenteException() {
		super("El jugador que intenta cambiar no existe");
	}
}
