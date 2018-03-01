class Motorbike extends Vehicle{
	
	public Boolean hasBox;
	public int Ccs;
	public Boolean hasRoof;
	
	public Motorbike(Garage g, int weight, String colour, int topSpeedKMPH, int price, boolean hasBox, int Ccs, boolean hasRoof) {
		super(g, weight,colour,topSpeedKMPH,price);
		this.hasBox = hasBox;
		this.Ccs = Ccs;
		this.hasRoof = hasRoof;
		
	}
	public String toString() {
		return super.toString() + " " + this.hasBox + " " + this.Ccs +"cc " + this.hasRoof;
	}
	
	
	
	
	
}

