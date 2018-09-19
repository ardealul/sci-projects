package smart_objects;
/*smart lamp
can be turned on and off
set brightness
set color*/

public class SmartLamp extends Host {
	private int brightness;
	private String color;
/**
 * daca dispozitivul e pornit, returneaza 5, altfel 0
 */
	@Override
	public double getConsumption() {
		if (isOn==true)
		return 5;
		else return 0;
	}

	public int getBrightness() {
		return brightness;
	}
/**
 * Pentru a seta luminozitatea de la lampa, exista 3 reguli, sa fie mai mare sau egala cu 0 si mai mica sau egala cu 100
 * si sa fie pornita lampa
 * @param Primeste un brightness pe care noi il bagam si in functie de el seteaza luminozitatea
 */
	public void setBrightness(int brightness) {
		if(brightness>=0 && brightness<=100&&isOn==true)
		this.brightness = brightness;
		else {this.brightness = 0;
		isOn=false;}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public SmartLamp(boolean isOn, int brightness, String color) {
		super(isOn);
		this.brightness = brightness;
		this.color = color;
	}

	@Override
	public String toString() {
		return "SmartLamp [isOn= "+isOn+", brightness= " + brightness + ", color=" + color + "]";
	}

}
