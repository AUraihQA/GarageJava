package GarageOOP;

public class Van extends Vehicle {
	private String name;
	private String capacity;
	

	@Override
	public String toString() {
		return "Van [name=" + name + ", capacity=" + capacity + ", brand=" + brand + ", wheels=" + wheels + ", fuel="
				+ fuel + "]";
	}
	
	public Van(String name, String capacity, String brand, int wheels, String fuel) {
		super();
		this.name = name;
		this.capacity = capacity;
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

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

}
