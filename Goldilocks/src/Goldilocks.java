import java.util.ArrayList;



public class Goldilocks {

	public static void main(String[] args) {
		
		
		for(Chair c: createChairs()) {
			if((c.tooFat(100) == "Not fat") && (c.tooHot(120) == "Can eat")) {
				System.out.println(c.chairNumber);
			}
			
			
		}
			
		
	}
		
public static ArrayList<Chair> createChairs(){		
		
	ArrayList<Chair> listOfChairs = new ArrayList<>();
		
		Chair a = new Chair(297,90,1);
		listOfChairs.add(a);
		Chair b = new Chair(66,110,2);
		listOfChairs.add(b);
		Chair c = new Chair(257,113,3);
		listOfChairs.add(c);
		Chair d = new Chair(276,191,4);
		listOfChairs.add(d);
		Chair e = new Chair(280,129,5);
		listOfChairs.add(e);
		Chair f = new Chair(219,163,6);
		listOfChairs.add(f);
		Chair g = new Chair(254,193,7);
		listOfChairs.add(g);
		Chair h = new Chair(86,153,8);
		listOfChairs.add(h);
		Chair i = new Chair(206,147,9);
		listOfChairs.add(i);
		Chair j = new Chair(71,137,10);
		listOfChairs.add(j);
		
		
		return listOfChairs;
		
		
		
		
		
}	
	

}
