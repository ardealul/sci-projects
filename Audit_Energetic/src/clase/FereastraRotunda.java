package clase;


public class FereastraRotunda implements Suprafata {
	protected double raza;

	@Override
	public double calcSuprafata() {
		return Math.PI*raza*raza;
	}

	public FereastraRotunda(double raza) {
		super();
		this.raza = raza;
	}

}
