package clase;
import clase.Suprafata;

public class Ferestre extends LungimeLatime implements Suprafata {

	public Ferestre(double lungime, double latime, String tip) {
		super(lungime, latime, tip);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcSuprafata() {
		
		return lungime*latime;
	}

}
