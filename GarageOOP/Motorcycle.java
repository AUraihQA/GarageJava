package GarageOOP;

public class Motorcycle extends Vehicle{
	private String Name;
	private String Engine;


	@Override
	public String toString() {
		return "Motorcycle [Name=" + Name + ", Engine=" + Engine + ", brand=" + brand + ", wheels=" + wheels + ", fuel="
				+ fuel + "]";
	}

	
	
	public Motorcycle(String name, String engine, String brand, int wheels, String fuel) {
		super();
		Name = name;
		Engine = engine;
		super.brand = brand;
		super.fuel = fuel;
		super.wheels = wheels;
	}



	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEngine() {
		return Engine;
	}

	public void setEngine(String engine) {
		Engine = engine;
	}

}
