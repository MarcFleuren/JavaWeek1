
public class RunnerClass {

	public static void main(String[] args) {
		
		Garage g = new Garage();
		// TODO Auto-generated method stub
		Airplane a = new Airplane(g,5000,"blue",450,50000,35,true,35000);
		Motorbike b = new Motorbike(g,200,"red",130,7000,true,300,false);
		Airplane c = new Airplane(g,20000,"white",800,1150000,35,true,35000);
		Motorbike d = new Motorbike(g,300,"purple",130,12000,true,600,false);
		Airplane e = new Airplane(g,10000,"orange",300,20000,25,false,20000);
		Motorbike f = new Motorbike(g,200,"blue",130,8000,true,400,false);
		
		
		
		for(Vehicle v: g.garageInventory) {
			
			
			System.out.println(v.getClass().getCanonicalName() + v.toString());
			
		
		}
		
		
	}

}
