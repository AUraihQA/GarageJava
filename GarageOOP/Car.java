package GarageOOP;



public class Car extends Vehicle{
	private String name;
	private int seats;
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", seats=" + seats + ", brand=" + brand + ", wheels=" + wheels + ", fuel=" + fuel
				+ "]";
	} 

	public Car(String name, int seats, String brand, int wheels, String fuel) {
		super();
		this.name = name;
		this.seats = seats;
		super.brand = brand;
		super.fuel = fuel;
		super.wheels = wheels;
	} 


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeats() {
		return seats;
	}

	public int setSeats(int seats) {
		return this.seats = seats;
	}
	
}

	
	
	



