package clase;

public class Perete extends LungimeLatime implements Suprafata{

	public Perete(double lungime, double latime, String tip) {
		super(lungime, latime, tip);
	
	}

	@Override
	public double calcSuprafata() {
		return lungime*latime;
	}

}
