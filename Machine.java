/*Class Machine is an abstract class that can be either Motor or Pump
 */
public abstract class Machine {
	private int idNumber;
	private String manufacturer;
	private double price;
	//Default constructor
	public Machine() {
	}
	//Constructor that sets idNumber, manufacturer and price
	public Machine(int idNumber, String manufacturer, double price) {
		setIDNumber(idNumber);
		setManufacturer(manufacturer);
		setPrice(price);
	}
	//Method to set IDNumber
	public final void setIDNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	//Method that returns IDNumber
	public int getIDNumber() {
		return this.idNumber;
	}
	//Method to set manufacturer
	public final void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	//Method that returns manufacturer
	public String getManufacturer() {
		return this.manufacturer;
	}
	//Method to set price
	public final void setPrice(double price) {
		this.price = price;
	}
	//Method that returns price
	public double getPrice() {
		return this.price;
	}
	//Method that returns power or capacity
	public String getPowerOrCapacityAsString() {
		return String.format("%.2f %s", getPowerOrCapacity(), getUnit());
	}	
	//Method that override Object's toString
	@Override
	public String toString() {
		return String.format("%5d %-20s %-10s %-20s $%,8.2f  ", getIDNumber(), getManufacturer(), getType(), getPowerOrCapacityAsString(), getPrice());
	}
	//Bunch of abstract methods that has to be defined in Motor or Pump class
	public abstract String getUnit();
	public abstract String getType();
	public abstract void setPowerOrCapacity(double powerOrCapacity);
	public abstract double getPowerOrCapacity();
}
