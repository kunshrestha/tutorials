public class Pump extends Machine {
	public static final String TYPE = "Pump";
	public static final String UNIT = "lt./min.";
	private double capacity;
	
	//Constructor to initialize Pump object
	public Pump(int idNumber, String manufacturer, double capacity, double price) {
		super(idNumber, manufacturer, price);
		setPowerOrCapacity(capacity);
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
	
	//Method to set its capacity
	@Override
	public void setPowerOrCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	//Method that returns its capacity
	@Override
	public double getPowerOrCapacity() {
		return this.capacity;
	}
}

