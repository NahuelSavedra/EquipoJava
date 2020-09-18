package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;


public class EquipoDeFultbolTest {
	@Test
	public void queSePuedaCrearUnEquipoVacio() {
		EquipoDeFutbol equipo = new EquipoDeFutbol ("Argentina");
		Integer ve = 0;
		Integer vo = equipo.getJugadores().size();
		
		assertEquals(ve,vo);
	}
	@Test
	public void queSePuedanAgregarJugadorAlEquipo() {
		EquipoDeFutbol equipo = new EquipoDeFutbol ("Argentina");
		Jugador j1 = new Jugador(10,"Leo Messi",100000000);

		
		try {
			equipo.agregarJugador(j1);
			} catch (JugadorDuplicadoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CapacidadMaximaException e) {
			e.printStackTrace();
		}
		
		Integer ve = 1;
		Integer vo = equipo.getJugadores().size();
		assertEquals(ve,vo);		

	}
	
	@Test(expected=JugadorDuplicadoException.class)
	public void queAlIntentarAgregarUnJugadorExistenetLanceExcepcion() throws JugadorDuplicadoException{
		EquipoDeFutbol equipo = new EquipoDeFutbol("River Plate");
		Jugador j1 = new Jugador(10,"Juanfer Quintero",10000000);
		Jugador j2 = new Jugador(5,"Juanfer Quintero",50000000);
		
		try {
			equipo.agregarJugador(j1);
			equipo.agregarJugador(j2);
		} catch (CapacidadMaximaException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected=CapacidadMaximaException.class)
	public void queAlIntentarAgregarCantidadExcesivaDeJugadoresLanceExcepcion() throws CapacidadMaximaException{
		EquipoDeFutbol equipo = new EquipoDeFutbol("Seleccion Argentina");
		
		Jugador j1 = new Jugador(10,"Messi",100000000);
		Jugador j2 = new Jugador(9,"Higuain",3000000);
		Jugador j3 = new Jugador(5,"Paredes",15000);
		Jugador j4 = new Jugador(7,"Di Maria",140222);
		Jugador j5 = new Jugador(5,"Biglia",130000);
		Jugador j6 = new Jugador(3,"Dybala",25000);
		Jugador j7 = new Jugador(1,"Romero",123000);
		Jugador j8 = new Jugador(2,"Ocampo",80000);
		Jugador j9 = new Jugador(1,"Armani",900000);
		Jugador j10 = new Jugador(1,"Aguero",260000);
		Jugador j11 = new Jugador(7,"Palacios",147000);
		Jugador j12 = new Jugador(4,"Perez",500000);
		Jugador j13 = new Jugador(4,"Pezzela",10000);
		Jugador j14 = new Jugador(6,"Dominguez",25000);
		Jugador j15 = new Jugador(8,"Mcallister",100000000);
		Jugador j16 = new Jugador(9,"Acuña",50000);
		Jugador j17 = new Jugador(8,"Saravia",30000000);
		Jugador j18 = new Jugador(8,"Otamendi",2000000);
		Jugador j19 = new Jugador(9,"Tevez",3000000);
		Jugador j20 = new Jugador(9,"Martines",4000000);
		Jugador j21 = new Jugador(10,"Lamela",5000000);
		Jugador j22 = new Jugador(6,"Mercado",10000000);
		Jugador j23 = new Jugador(4,"De Paul",25000000);
		Jugador j24 = new Jugador(10,"Lo Celso",35000000);
		
			try {
					equipo.agregarJugador(j1);
					equipo.agregarJugador(j2);
					equipo.agregarJugador(j3);
					equipo.agregarJugador(j4);
					equipo.agregarJugador(j5);
					equipo.agregarJugador(j6);
					equipo.agregarJugador(j7);
					equipo.agregarJugador(j8);
					equipo.agregarJugador(j9);
					equipo.agregarJugador(j10);
					equipo.agregarJugador(j11);
					equipo.agregarJugador(j12);
					equipo.agregarJugador(j13);
					equipo.agregarJugador(j14);
					equipo.agregarJugador(j15);
					equipo.agregarJugador(j16);
					equipo.agregarJugador(j17);
					equipo.agregarJugador(j18);
					equipo.agregarJugador(j19);
					equipo.agregarJugador(j20);
					equipo.agregarJugador(j21);
					equipo.agregarJugador(j22);
					equipo.agregarJugador(j23);
					equipo.agregarJugador(j24);
			} 
				catch (JugadorDuplicadoException e) {
				e.printStackTrace();
				}
			System.out.println();
	}
	@Test
	public void queSePuedaCambiarUnJugador(){
		EquipoDeFutbol equipo = new EquipoDeFutbol("Seleccion Argentina");

		Jugador j1 = new Jugador(10,"Messi",100000000);
		Jugador j2 = new Jugador(9,"Higuain",3000000);

		try {
			equipo.agregarJugador(j1);
		} catch (CapacidadMaximaException | JugadorDuplicadoException e) {
			e.printStackTrace();
		}
		
		
		try {
			equipo.cambiarJugador(j1, j2);
		} catch (JugadoreInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(equipo.getJugadores().contains(j2));
		assertFalse(equipo.getJugadores().contains(j1));
		
		
		
	}
	@Test (expected=JugadoreInexistenteException.class)
	public void queAlCambiarUnJugadorInexistenteLanceExcepcion() throws JugadoreInexistenteException{
		EquipoDeFutbol equipo = new EquipoDeFutbol("Seleccion Argentina");
		
		Jugador j1 = new Jugador(10,"Messi",100000000);
		Jugador j2 = new Jugador(9,"Higuain",3000000);
		Jugador j3 = new Jugador(9,"Perez",3000000);
		Jugador j4 = new Jugador(6,"Fernandez",3000000);

		
		try {
			equipo.agregarJugador(j1);
			equipo.agregarJugador(j2);
		} catch (CapacidadMaximaException | JugadorDuplicadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		equipo.cambiarJugador(j3, j4);
	}
	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNombre(){
		//el treeset esta ordenado por el nombre de los jugadores
		EquipoDeFutbol equipo = new EquipoDeFutbol("Seleccion Argentina");
		
		Jugador j1 = new Jugador(10,"Messi",100000000);
		Jugador j2 = new Jugador(9,"Higuain",3000000);
		Jugador j3 = new Jugador(9,"Perez",3000000);
		
		try {
			equipo.agregarJugador(j1);
			equipo.agregarJugador(j2);
			equipo.agregarJugador(j3);
		} catch (CapacidadMaximaException | JugadorDuplicadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		equipo.devolverPlanteOrdenadoPorNombreDeJugador();
		
		Iterator<Jugador> it = equipo.getJugadores().iterator();
		Integer i=1;
		while (it.hasNext()) {
			Jugador a = it.next();
			switch (i) {
			case 1:
				assertEquals("Higuain",a.getNombre());
				i++;
				break;
			case 2:
				assertEquals("Messi",a.getNombre());
				i++;
				break;
			case 3:
				assertEquals("Perez",a.getNombre());
				i++;
				break;
			}
		}
		
	}
	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorPrecioDeCompra(){
		Jugador j1 = new Jugador(10,"Messi",100000000);
		Jugador j2 = new Jugador(9,"Higuain",3000000);
		Jugador j3 = new Jugador(9,"Perez",900000);
		OrdenPrecioDeCompra orden = new OrdenPrecioDeCompra();
		EquipoDeFutbol equipo = new EquipoDeFutbol("Seleccion Argentina", orden);
	
		try {
			equipo.agregarJugador(j1);
			equipo.agregarJugador(j2);
			equipo.agregarJugador(j3);
		} catch (CapacidadMaximaException | JugadorDuplicadoException e) {
			e.printStackTrace();
		}
		equipo.devolverPlanteOrdenadoPorPrecioDeCompraDeJugador();
		
		Iterator<Jugador> it = equipo.getJugadores().iterator();
		Integer i=1;
		while (it.hasNext()) {
			Jugador a = it.next();
			switch (i) {
			case 1:
				assertEquals(900000,a.getPrecio(), 0.00);
				i++;
				break;
			case 2:
				assertEquals(3000000,a.getPrecio(), 0.00);
				i++;
				break;
			case 3:
				assertEquals(100000000,a.getPrecio(), 0.00);
				i++;
				break;
			}
		}
		
		
	}
	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNumeroDeCamiseta(){
		Jugador j1 = new Jugador(10,"Messi",100000000);
		Jugador j2 = new Jugador(9,"Higuain",3000000);
		Jugador j3 = new Jugador(7,"Perez",900000);
		OrdenPorNumeroCamiseta orden = new OrdenPorNumeroCamiseta();
		EquipoDeFutbol equipo = new EquipoDeFutbol("Seleccion Argentina", orden);
	
		try {
			equipo.agregarJugador(j1);
			equipo.agregarJugador(j2);
			equipo.agregarJugador(j3);
		} catch (CapacidadMaximaException | JugadorDuplicadoException e) {
			e.printStackTrace();
		}
		equipo.devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador();
		
		Iterator<Jugador> it = equipo.getJugadores().iterator();
		Integer i=1;
		while (it.hasNext()) {
			Jugador a = it.next();
			switch (i) {
			case 1:
				assertEquals(7,a.getNumero(), 0.00);
				i++;
				break;
			case 2:
				assertEquals(9,a.getNumero(), 0.00);
				i++;
				break;
			case 3:
				assertEquals(10,a.getNumero(), 0.00);
				i++;
				break;
			}
		}
	}
}
