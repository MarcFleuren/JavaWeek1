public abstract class Vehicle{
	public int weight;
	public String colour;
	public int topSpeedKMPH;
	public int price;
	
	
	public Vehicle(int weight, String colour, int topSpeedKMPH, int price) {
		this.weight = weight;
		this.colour = colour;
		this.topSpeedKMPH = topSpeedKMPH;
		this.price = price;
	}
		
	public String toString() {
		return this.weight  + "kg " + this.colour + " "+ this.topSpeedKMPH +"kmph " +"£" + this.price; 
	}
		
		
	}
	

