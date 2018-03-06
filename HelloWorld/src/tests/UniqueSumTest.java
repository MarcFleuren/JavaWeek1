package tests;

import static org.junit.Assert.*;
import abc.UniqueSum1;

import org.junit.Test;

public class UniqueSumTest {

	@Test
	public void allEqual() {
		int result = UniqueSum1.uniqueAddition(3, 3, 3);
		assertEquals(0,result);
		
	}

	@Test
	public void test2() {
		int result = UniqueSum1.uniqueAddition(1, 2, 3);
		assertEquals(6,result);
		
	}
	@Test
	public void test3() {
		int result = UniqueSum1.uniqueAddition(1, 1, 2);
		assertEquals(2,result);
		
	}
}
