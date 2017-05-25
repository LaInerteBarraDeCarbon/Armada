package armada;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Armada {

	private List<Soldado> listaSoldados = new ArrayList<Soldado>();

	private List<Soldado> formacionSoldados = new ArrayList<Soldado>();

	public void agregarSoldado(Soldado soldado) {
		listaSoldados.add(soldado);
	}

	/**
	 * Devuelve lista de soldados ordenado por sus rangos. De mayor a menor.
	 * <br>
	 * 
	 * @return
	 */
	public List<Soldado> formacionUno() {
		formacionSoldados = listaSoldados;
		formacionSoldados.sort(new ComparaRango());
		return formacionSoldados;
	}

	/**
	 * Devuelve lista de soldados ordenado por su velocidad. De menor a mayor.
	 * <br>
	 * 
	 * @return
	 */
	public List<Soldado> formacionDos() {
		formacionSoldados = listaSoldados;
		formacionSoldados.sort(new ComparaVelocidad());
		return formacionSoldados;
	}

//	public Map<TipoSoldado, List<Soldado>> agrupar() {
//		Map<TipoSoldado, V>
//	}
}
