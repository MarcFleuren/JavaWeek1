package tests;

import static org.junit.Assert.*;

import abc.TooHot;


import org.junit.Test;

public class TooHotTest {

	@Test
	public void tooHotNotSummer() {
		boolean result = TooHot.tooHot(95,false);
		
		assertFalse("Boolean was False", result);
		
	}
	@Test
	public void notTooHotSummer() {
		boolean result = TooHot.tooHot(100,true);
		
		assertTrue("Boolean was False", result);
		
	}
	@Test
	public void tooHotNotSummerBoundaryTest() {
		boolean result = TooHot.tooHot(90,false);
		
		assertTrue("Boolean was False", result);
		
	}

}
