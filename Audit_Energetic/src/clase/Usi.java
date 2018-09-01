package clase;

public class Usi extends LungimeLatime implements Suprafata{

	public Usi(double lungime, double latime, String tip) {
		super(lungime, latime, tip);
	}

	@Override
	public double calcSuprafata() {
		return lungime*latime;
	}

}
