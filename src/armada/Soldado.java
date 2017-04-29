package armada;

public class Soldado {

	private int rango;
	private double velocidad;
	private TipoSoldado tipoSoldado;

	public Soldado(TipoSoldado tipoSoldado, int rango, double velocidad) {
		this.rango = rango;
		this.velocidad = velocidad;
		this.tipoSoldado = tipoSoldado;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public TipoSoldado getTipoSoldado() {
		return tipoSoldado;
	}

	public void setTipoSoldado(TipoSoldado tipoSoldado) {
		this.tipoSoldado = tipoSoldado;
	}
}
