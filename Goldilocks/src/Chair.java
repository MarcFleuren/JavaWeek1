
public class Chair {
	public int maxWeight;
	public int temperatureOfPorridge;
	public int chairNumber;
	
	public Chair(int maxWeight, int temperatureOfPorridge, int chairNumber) {
		this.maxWeight = maxWeight;
		this.temperatureOfPorridge = temperatureOfPorridge;
		this.chairNumber = chairNumber;
	}
		
	public String tooHot(int goldilocksCapacity) {
		if ( goldilocksCapacity > temperatureOfPorridge) {
			return "Can eat";
		} else {
			return "Too Hot";
		}
		
	}
	public String tooFat(int goldilocksWeight) {
		if (goldilocksWeight > maxWeight) {
			return "Too fat";
		} else {
			return "Not fat";
		}
			
	}
}
