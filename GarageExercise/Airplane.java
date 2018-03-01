class Airplane extends Vehicle{
	public int wingSpan;
	public Boolean hasJetEngine;
	public int maxAltitude;
	
	public Airplane(Garage g,int weight, String colour, int topSpeedKMPH, int price, int wingSpan, Boolean hasJetEngine, int maxAltitude) {
		super(g,weight,colour,topSpeedKMPH,price);
		this.wingSpan = wingSpan;
		this.hasJetEngine = hasJetEngine;
		this.maxAltitude = maxAltitude;
	}
	public String toString() {
		
		return super.toString() + " " + this.wingSpan + "feet " + this.hasJetEngine +" " + this.maxAltitude + "feet";
		
			
		}
	}

