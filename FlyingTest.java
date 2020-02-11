import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlyingTest {
	String pilot = "sitting";
	int numOfPilot = 2;
	int passengers = 4;
	String engine = "on";
	String state = "took-off";

	@Test
	void tesOnAir() {
		Flying fly = new Flying(pilot, numOfPilot, passengers, engine, state);
		assertEquals(fly.onAir(), fly.onAir());
	}
	
	@Test
	void testGetPilot() {
		Flying fly = new Flying();
		assertEquals(pilot, fly.getPilot());
	}
	
	@Test
	void testNumOfPilot() {
		Flying fly = new Flying();
		assertEquals(numOfPilot, fly.getNumofPilot());
	}
	
	@Test
	void testPassengers() {
		Flying fly = new Flying();
		assertEquals(passengers, fly.getPassengers());
	}
	
	@Test
	void testEngine() {
		Flying fly = new Flying();
		assertEquals(engine, fly.getEngine());
	}
	
	@Test
	void testState() {
		Flying fly = new Flying();
		assertEquals(state, fly.getState());
	}

}
