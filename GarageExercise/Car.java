
class Car extends Garage{
	
	public int numberOfDoors;
	public int numberOfWipers;
	public int numberOfWindows;
	
	
	public Car(int weight, String colour, int topSpeedKMPH, int price,int numberOfDoors, int numberOfWipers, int numberOfWindows) {
		super();
		this.numberOfDoors = numberOfDoors;
		this.numberOfWindows = numberOfWindows;
		this.numberOfWipers = numberOfWipers;
	}
	public String toString() {
		return super.toString() + " " + this.numberOfDoors + " " + this.numberOfWipers +" " + this.numberOfWindows;
	}
	}

	


