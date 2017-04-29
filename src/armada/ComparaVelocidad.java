package armada;

import java.util.Comparator;

public class ComparaVelocidad implements Comparator<Soldado> {

	@Override
	public int compare(Soldado o1, Soldado o2) {
		if (o1.getVelocidad() > o2.getVelocidad()) {
			return 1;
		}
		if (o1.getVelocidad() < o2.getVelocidad()) {
			return -1;
		}
		return 0;
	}
}
