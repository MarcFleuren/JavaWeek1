package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import main.*;




public class AddVehicleTest {
//	@Before
//	public void createObjects() {
//	Garage g = new Garage();
//	
//	Car abc = new Car(2500, "white", 160, 60000, 5, 3, 6);
//	
//	g.addVehicle(abc);
//	
//	}
	@Test
	public void test() {
		Garage g = new Garage();
		
		Car abc = new Car(2500, "white", 160, 60000, 5, 3, 6);
		
		g.addVehicle(abc);
		
		String result = g.displayGarage();
		
		assertEquals("hello",result);
		
		
	}

}
