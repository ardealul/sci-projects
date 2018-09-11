package anexa1;

public class Anexa1 {
String produsBrut;
String produsDivizat;
String densitatea;
double conductivitatea;
public String getProdusBrut() {
	return produsBrut;
}
public void setProdusBrut(String produsBrut) {
	this.produsBrut = produsBrut;
}
public String getProdusDivizat() {
	return produsDivizat;
}
public void setProdusDivizat(String produsDivizat) {
	this.produsDivizat = produsDivizat;
}
public String getDensitatea() {
	return densitatea;
}
public void setDensitatea(String densitatea) {
	this.densitatea = densitatea;
}
public double getConductivitatea() {
	return conductivitatea;
}
public void setConductivitatea(double conductivitatea) {
	this.conductivitatea = conductivitatea;
}
public Anexa1(String produsBrut, String produsDivizat, String densitatea, double conductivitatea) {
	super();
	this.produsBrut = produsBrut;
	this.produsDivizat = produsDivizat;
	this.densitatea = densitatea;
	this.conductivitatea = conductivitatea;
}

}
