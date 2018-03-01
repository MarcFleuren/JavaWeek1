public abstract class Vehicle{
	public String type;
	public int weight;
	public String colour;
	public int topSpeedKMPH;
	public int price;
	
	
	
	public Vehicle(Garage g,int weight, String colour, int topSpeedKMPH, int price) {
//		this.type = type;
		this.weight = weight;
		this.colour = colour;
		this.topSpeedKMPH = topSpeedKMPH;
		this.price = price;
		g.addVehicle(this);
	}
		
	public String toString() {
		return this.weight  + "kg " + this.colour + " "+ this.topSpeedKMPH +"kmph " +"£" + this.price; 
	}
		
		
	}
	

