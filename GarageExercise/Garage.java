import java.util.ArrayList;

public class Garage {
	
	public static void main(String[] args) {
		Airplane a = new Airplane(5000,"blue",450,50000,35,true,35000);
		Motorbike b = new Motorbike(200,"red",130,7000,true,300,false);
		
		ArrayList<Vehicle> garageList = new ArrayList<>();
		
		garageList.add(a);
		garageList.add(b);
		
		for(Vehicle v : garageList ) {
			
		
			System.out.println(v);
		}
			
			
			
	}
}


