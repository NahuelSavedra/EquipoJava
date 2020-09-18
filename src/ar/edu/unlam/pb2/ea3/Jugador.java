package ar.edu.unlam.pb2.ea3;

public class Jugador implements Comparable<Jugador>{

	private Integer numero;
	private String nombre;
	private Integer precio;
	
	
	public Jugador(Integer numero, String nombre, Integer precio) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Jugador o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
	
	
	
}
