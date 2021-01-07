package GarageOOP;

public class Vehicle {
	
	public String brand;
	public int wheels;
	public String fuel;
	
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", wheels=" + wheels + ", fuel=" + fuel + "]";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getBrand() {
		return brand;
	}

	public int getWheels() {
		return wheels;
	}

	public String getFuel() {
		return fuel;
	}
	
	
}
