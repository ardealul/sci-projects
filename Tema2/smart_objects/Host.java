package smart_objects;
/*turn on or off all smart-home devices
get electricity consumption from all devices
get state from all devices, and print it to the console.
return an array of all the smart-devices in the system*/
public abstract class Host {
	boolean isOn;
	public void turnOn() {
		this.isOn=true;
	}
	public abstract double getConsumption();
	public boolean getState() {

		return isOn;
	}
	/*public Host[] getDevices() {
		for(Host[] elements:Host[])
		return Host[i];
	}*/
	public void turnOff() {
		this.isOn=false;
	}
	public Host(boolean isOn) {
		super();
		this.isOn = isOn;
	}
	 public static Host Lista(Host array){
	
	
	        return array;
	    }
	@Override
	public String toString() {
		return "Host [isOn=" + isOn + "]";
	}
	
}
