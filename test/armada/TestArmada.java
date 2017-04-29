package armada;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestArmada {

	private Armada armada;
	List<Soldado> lista;

	@Before
	public void iniciar() {
		lista = new ArrayList<Soldado>();
		
		armada = new Armada();
		armada.agregarSoldado(new Soldado(TipoSoldado.Arquero, 3, 7.0));
		armada.agregarSoldado(new Soldado(TipoSoldado.Caballero, 1, 3.0));
		armada.agregarSoldado(new Soldado(TipoSoldado.Hoplita, 7, 1.0));
	}

	@Ignore
	public void testFormacionUno() {
		lista = armada.formacionUno();
		for (ListIterator<Soldado> iterator = lista.listIterator(); iterator.hasNext();) {
			Soldado each = iterator.next();
			System.out.println("Soldado: " + each.getTipoSoldado().toString() + "\tRango " + each.getRango()
					+ "\tVelocidad" + each.getVelocidad());
		}
	}

	@Test
	public void testFormacionDos() {
		lista = armada.formacionDos();
		for (ListIterator<Soldado> iterator = lista.listIterator(); iterator.hasNext();) {
			Soldado each = iterator.next();
			System.out.println("Soldado: " + each.getTipoSoldado().toString() + "\tRango " + each.getRango()
					+ "\tVelocidad: " + each.getVelocidad());
		}
	}
}
