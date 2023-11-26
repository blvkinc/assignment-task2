package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DominoTest {

	@Test
	public void testConstructorAndGetters() {
		Domino domino = new Domino(3, 5);

		assertEquals(3, domino.getHigh());
		assertEquals(5, domino.getLow());
		assertFalse(domino.isPlaced());
	}

	@Test
	public void testPlace() {
		Domino domino = new Domino(2, 4);
		domino.place(1, 1, 2, 2);

		assertTrue(domino.isPlaced());
		assertEquals(1, domino.getHx());
		assertEquals(1, domino.getHy());
		assertEquals(2, domino.getLx());
		assertEquals(2, domino.getLy());
	}

	@Test
	public void testToString() {
		Domino domino = new Domino(1, 6);
		assertEquals("[16]unplaced", domino.toString());

		domino.place(2, 2, 3, 3);
		assertEquals("[16](3,3)(4,4)", domino.toString());
	}

	@Test
	public void testInvert() {
		Domino domino = new Domino(4, 3);
		domino.place(1, 1, 2, 2);
		domino.invert();

		assertEquals(2, domino.getHx());
		assertEquals(2, domino.getHy());
		assertEquals(1, domino.getLx());
		assertEquals(1, domino.getLy());
	}

	@Test
	public void testIshl() {
		Domino horizontalDomino = new Domino(2, 4);
		Domino verticalDomino = new Domino(5, 3);

		horizontalDomino.place(1, 1, 2, 1);
		verticalDomino.place(3, 3, 3, 4);

		assertTrue(horizontalDomino.ishl());
		assertFalse(verticalDomino.ishl());
	}

	
}