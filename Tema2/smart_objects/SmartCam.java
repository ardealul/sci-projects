package smart_objects;
/*smart security camera
can be turned on and off
can start/stop filming*/
public class SmartCam extends Host{
	private boolean filming;

	@Override
	public double getConsumption() {
		if(isOn==true&&filming==true)
		return 10;
		else if(isOn==true&&filming==false)
		return 5;
		else
		return 0;
	}

	public boolean isFilming() {
		return filming;
	}

	public void StartFilming() {
		this.filming = true;
	}
	public void StopFilming() {
		this.filming=false;
	}

	public SmartCam(boolean isOn, boolean filming) {
		super(isOn);
		this.filming = filming;
	}

	@Override
	public String toString() {
		return "SmartCam [filming=" + filming + ", isOn=" + isOn + "]";
	}

}
