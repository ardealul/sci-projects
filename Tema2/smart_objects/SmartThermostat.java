package smart_objects;
/*smart thermostat
can be turned on and off
can set temperature*/

public class SmartThermostat extends Host {
	private int temperature;
/**
 * daca dispozitivul e pornit, returneaza 3, altfel 0
 */
	@Override
	public double getConsumption() {
		if (isOn==true)
		return 3;
		else return 0;
	}

	public int getTemperature() {
		return temperature;
	}
/**
 * Primeste o temperatura intre -20 si 29, daca nu e intre aceste valori, returneaza "temperatura nu e buna"
 * @param temperature
 */
	public void setTemperature(int temperature) {
		if(temperature>-20 && temperature<30) {
		this.temperature = temperature;}
		else {System.out.println("Temperatura nu e buna");}
	}

	public SmartThermostat(boolean isOn, int temperature) {
		super(isOn);
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "SmartThermostat [temperature=" + temperature + ", isOn=" + isOn + "]";
	}

}
