/*Class to define machine with Motor type
 */
public class Motor extends Machine {
	public static final String TYPE = "Motor";
	public static final String UNIT = "h.p.";
	private double power;
	
	//Constructor to initialize Motor object
	public Motor(int idNumber, String manufacturer, double power, double price) {
		super(idNumber, manufacturer, price);
		setPowerOrCapacity(power);
	}
	
	//Method that returns its unit
	@Override
	public String getUnit() {
		return this.UNIT;
	}
	
	//Method that returns its type
	@Override
	public String getType() {
		return this.TYPE;
	}
	//Method to set its power
	@Override
	public void setPowerOrCapacity(double power) {
		this.power = power;
	}
	
	//Method that returns its power
	@Override
	public double getPowerOrCapacity() {
		return this.power;
	}
}
