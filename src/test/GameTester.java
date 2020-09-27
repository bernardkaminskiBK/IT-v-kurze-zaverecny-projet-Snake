package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import application.Game;

/**
 * GameTester je testovacia trieda, ktora obsahuje JUnit testy
 * @author Pali
 *
 */
public class GameTester {

	
	public static void main(String[] args) {
//		Game game = new Game();
//		System.out.print("Score: ");
//		System.out.println(game.getScoreResult());
//		System.out.print("CornerSize: ");
//		System.out.println(game.getCornersize());
//		System.out.print("Food color: ");
//		System.out.println(game.getFoodcolor());
//		System.out.print("Food x: ");
//		System.out.println(game.getFoodX());
//		System.out.print("Food y: ");
//		System.out.println(game.getFoodY());
//		System.out.print("Height : ");
//		System.out.println(game.getHeight());
//		System.out.print("Meno: ");
//		System.out.println(game.getPlayerName());
//		System.out.print("Speed: ");
//		System.out.println(game.getSpeed());
//		System.out.print("Width: ");
//		System.out.println(game.getWidth());
//		System.out.print("Direction: ");
//		System.out.println(game.getDirection());
//		System.out.print("Random: ");
//		System.out.println(game.getRand().toString());
//		System.out.print("Snake: ");
//		System.out.println(game.getSnake());
//		System.out.print("Game Over: ");
//		System.out.println(game.isGameOver());
//		
//		System.out.println();
//		System.out.println();
//		
//		Game game1 = new Game("Player1");
//		System.out.print("Score: ");
//		System.out.println(game1.getScoreResult());
//		System.out.print("CornerSize: ");
//		System.out.println(game1.getCornersize());
//		System.out.print("Food color: ");
//		System.out.println(game1.getFoodcolor());
//		System.out.print("Food x: ");
//		System.out.println(game1.getFoodX());
//		System.out.print("Food y: ");
//		System.out.println(game1.getFoodY());
//		System.out.print("Height : ");
//		System.out.println(game1.getHeight());
//		System.out.print("Meno: ");
//		System.out.println(game1.getPlayerName());
//		System.out.print("Speed: ");
//		System.out.println(game1.getSpeed());
//		System.out.print("Width: ");
//		System.out.println(game1.getWidth());
//		System.out.print("Direction: ");
//		System.out.println(game1.getDirection().down);
//		System.out.print("Random: ");
//		System.out.println(game1.getRand().toString());
//		System.out.print("Snake: ");
//		System.out.println(game1.getSnake());
//		
//		System.out.print("Game Over: ");
//		System.out.println(game1.isGameOver());
//		
		
	}
	
	
	@Test
	@DisplayName("Test game bez parametra")
	public void testVytvorenieGameBezParametra() {
		Game game = new Game();
		assertNotNull(game);
	}
	
	@Test
	@DisplayName("Test game s parametrom")
	public void testVytvorenieGameSParametrom() {
		Game game = new Game("Hrac1");
		assertNotNull(game);
	}
	
	@Test
	@DisplayName("Test mena hraca")
	public void testMena() {
		Game game = new Game("Meno");
		assertNotNull(game.getPlayerName());
		System.out.println("Ocakavana hodnota: Meno\nRealna hodnota: "
				+ game.getPlayerName());
	}
	
	@Test
	@DisplayName("Test mena not null")
	public void testMenaNull() {
	Game game = new Game();
	assertEquals(null, game.getPlayerName());
	}
	
	@Test
	@DisplayName("Test farby jedla")
	public void testFoodColor() {
	Game game = new Game();
	assertEquals(0, game.getFoodcolor());
	}
	
	
	@Test
	@DisplayName("test Pohybu")
	public void testPohybu() {
		Game game = new Game();
		game.getDirection();
		assertNotNull(game.getDirection());
	}
	
	@Test
	@DisplayName("Test eat Food")
	public void testEatFood() {
		Game game = new Game();
		game.eatFoodTest();
		game.newFoodTest();
		assertNotNull(game.getFoodcolor());
		
	}
	
	@Test
	@DisplayName("Tvar Hada test")
	public void testShapeSNake() {
		Game game = new Game();
		game.initialShapeOfSnakeTest();
		assertNotNull(game.getSnake());
	}
	
	
	@Test
	@DisplayName("Timer test")
	public void testTimer() {
		Game game = new Game("123");
	
	}
	
	@Test
	@DisplayName("Tick test")
	public void testTickTest() {


	}
	
	@Test
	@DisplayName("Game over")
	public void testGameOver() {
		Game game = new Game();
		assertEquals(false, game.isGameOver());
	}
	
	@Test
	@DisplayName("Meno hraca")
	public void testPlayerName() {
		Game game = new Game("Hrac");
		assertEquals("Hrac", game.getPlayerName());
	}
	
	@Test
	@DisplayName("Snake")
	public void testSnake() {
		Game game = new Game();
		assertNotNull(game.getSnake());
	}
	
	@Test
	@DisplayName("food x")
	public void testFoodX() {
		Game game = new Game();
		assertEquals(0, game.getFoodX());
	}
	
	@Test
	@DisplayName("food y")
	public void testFoodY() {
		Game game = new Game();
		System.out.println(game.getFoodY());
		assertNotNull(game.getFoodY());
	}
	
	@Test
	@DisplayName("test Vyska")
	public void testHeight() {
		Game game = new Game();
		assertEquals(20, game.getHeight());
	}
	
	@Test
	@DisplayName("test roh")
	public void testCorner() {
		Game game = new Game();
		assertEquals(25, game.getCornersize());
	}
	
	@Test
	@DisplayName("test Sirka")
	public void testWidth() {
		Game game = new Game();
		assertEquals(20, game.getWidth());
	}
	
	
}
