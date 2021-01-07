package GarageOOP;

public class Runner {

	public static void main(String[] args) {
		Car merc = new Car("A Class Hatchback", 5, "Mercedes", 4, "Petrol");
		Motorcycle suz = new Motorcycle("Gsxr", "750cc", "Suzuki", 2, "Petrol");
		Van sprinter = new Van("Sprinter", "3500kg", "Mercedes", 4, "Petrol");
		
		GarageClass gar = new GarageClass();
		gar.addVeh(sprinter);
		gar.addVeh(suz);
		gar.addVeh(merc);
		
		
	
		
	
		
		
		

	}

}
