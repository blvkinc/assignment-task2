package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testGenerateDominoes() {
		Main main = new Main();
		main.generateDominoes();
		assertNotNull(main._d);
		assertEquals(28, main._d.size());
	}

	@Test
	public void testGenerateGuesses() {
		Main main = new Main();
		main.generateGuesses();
		assertNotNull(main._g);
		assertEquals(28, main._g.size());
	}

	@Test
	public void testCollateGrid() {
		Main main = new Main();
		main.generateDominoes();
		main.collateGrid();
		// Add assertions based on the expected behavior of collateGrid()
	}

	@Test
	public void testCollateGuessGrid() {
		Main main = new Main();
		main.generateGuesses();
		main.collateGuessGrid();
		// Add assertions based on the expected behavior of collateGuessGrid()
	}

	// Add more test methods for other functionalities

	@Test
	public void testRun() {
		Main main = new Main();
		// Mock user input/output and test the run method
		// Example: Set up input stream with ByteArrayInputStream and assert the output
		// ...

		// Reset System.out
		System.setOut(originalOut);
	}
}