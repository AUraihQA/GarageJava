package GarageOOP;

import java.util.ArrayList;
import java.util.List;

public class GarageClass {
	
private List<Vehicle> myList = new ArrayList<>();
	
	public void addVeh (Vehicle v) {
		myList.add(v);
	}
	
	public void removeVeh(Vehicle v) {
		myList.remove(v);
		}
	public void bill() {
	for (Vehicle v : myList) {
		
		if (v instanceof Car) {
			System.out.println("Bill is £" + 100 * v.getWheels());
			
			
		} else if (v instanceof Motorcycle) {
			System.out.println("Bill is £" + 50 * v.getWheels());
			
		} else {
			System.out.println("Bill is £" + 200 * v.getWheels());
			
		}
	}
	
	}
	
}


