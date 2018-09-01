package clase;

public class LungimeLatime implements Suprafata {
protected double lungime;
protected double latime;
protected String tip;
public String getTip() {
	return tip;
}
public void SetTip() {
	this.tip=tip;
}
public double getLungime() {
	return lungime;
}
public void setLungime(double lungime) {
	this.lungime = lungime;
}
public double getLatime() {
	return latime;
}
public void setLatime(double latime) {
	this.latime = latime;
}
public LungimeLatime(double lungime, double latime,String tip) {
	super();
	this.lungime = lungime;
	this.latime = latime;
	this.tip = tip;
}
@Override
public double calcSuprafata() {
	return latime*lungime;
}
}
