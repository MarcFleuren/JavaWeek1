package tests;

import static org.junit.Assert.*;



import org.junit.Test;

import abc.BlackJack;

public class BlackJackTest {

	@Test
	public void testPlayer1Win() {
		String result = BlackJack.blackjack(21,12);
		assertEquals("player 1 wins",result);
		
		
	}
	@Test
	public void testPlayer2Win() {
		String result = BlackJack.blackjack(24,12);
		assertEquals("player 2 wins",result);
		
		
	}
	@Test
	public void testDraw() {
		String result = BlackJack.blackjack(12,12);
		assertEquals("draw",result);
		
		
	}
	@Test
	public void testBust() {
		String result = BlackJack.blackjack(22,26);
		assertEquals("Bust",result);
		
		
	}
	

}
