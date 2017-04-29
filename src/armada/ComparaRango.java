package armada;

import java.util.Comparator;

public class ComparaRango implements Comparator<Soldado> {

	@Override
	public int compare(Soldado o1, Soldado o2) {
		if (o1.getRango() < o2.getRango()) {
			return 1;
		}
		if (o1.getRango() > o2.getRango()) {
			return -1;
		}
		return 0;
	}
}
