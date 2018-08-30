package smart_objects;
/*smart lamp
can be turned on and off
set brightness
set color*/

public class SmartLamp extends Host {
	private int brightness;
	private String color;

	@Override
	public double getConsumption() {
		if (isOn==true)
		return 5;
		else return 0;
	}

	public int getBrightness() {
		return brightness;
	}

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
