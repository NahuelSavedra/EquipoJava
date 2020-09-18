package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {
	private String nombre;
	private Set<Jugador> jugadores;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new TreeSet<Jugador>();
	}
	public EquipoDeFutbol(String nombre, Comparator ordenamiento) {
		this.nombre = nombre;
		this.jugadores = new TreeSet<Jugador>(ordenamiento);
	}

	/*
	 * La capacidad máxima de un equipo es 23. Cualquier intento de agregar más
	 * jugadores generará una excepción (CapacidadMaximaException). Además, no
	 * deberá permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	
	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException {
		Integer cantidadMaximaJugadores = 23;
		Integer cantidadDeJugadores = this.jugadores.size();
		if(cantidadDeJugadores<=cantidadMaximaJugadores){
			this.jugadores.add(jugador);
		}else {
			throw new CapacidadMaximaException();
		}
		if(jugadores.contains(jugador)) {
				throw new JugadorDuplicadoException();
		}
	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generará una excepción
	 * (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadoreInexistenteException{
		if (this.jugadores.contains(saliente)) {
			this.jugadores.remove(saliente);
			try {
				this.agregarJugador(entrante);
				return true;
			} catch (CapacidadMaximaException | JugadorDuplicadoException e) {
				e.printStackTrace();
			}
		} else {
			throw new JugadoreInexistenteException();
		}
		return false;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {
		return (TreeSet<Jugador>)this.jugadores;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		return ordenarELPlantelParaDevolver(new OrdenPrecioDeCompra());	
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		return ordenarELPlantelParaDevolver(new OrdenPorNumeroCamiseta());
	}

	private TreeSet<Jugador> ordenarELPlantelParaDevolver(Comparator criterioDeOrdenacion) {
		TreeSet<Jugador> equipoOrdenado = new TreeSet<>(criterioDeOrdenacion);
		equipoOrdenado.addAll(jugadores);
		return equipoOrdenado;


	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}
