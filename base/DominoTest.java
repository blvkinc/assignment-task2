import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DominoTest {

    private Domino domino;

    @BeforeEach
    public void setUp() {
        domino = new Domino(3, 5);
    }

    @Test
    public void testDominoInitialization() {
        Assertions.assertNotNull(domino);
    }

    @Test
    public void testToStringUnplaced() {
        String expected = "[35]unplaced";
        Assertions.assertEquals(expected, domino.toString());
    }

    @Test
    public void testPlace() {
        domino.place(0, 0, 1, 1);
        String expected = "[35](1,1)(2,2)";
        Assertions.assertEquals(expected, domino.toString());
    }

    @Test
    public void testInvert() {
        domino.place(0, 0, 1, 1);
        domino.invert();
        String expected = "[35](2,2)(1,1)";
        Assertions.assertEquals(expected, domino.toString());
    }

    @Test
    public void testIsHorizontal() {
        domino.place(0, 0, 1, 0);
        Assertions.assertTrue(domino.ishl());
    }

    @Test
    public void testCompareTo() {
        Domino smallerDomino = new Domino(2, 4);
        Assertions.assertTrue(domino.compareTo(smallerDomino) > 0);

        Domino equalDomino = new Domino(3, 5);
        Assertions.assertTrue(domino.compareTo(equalDomino) == 0);

        Domino largerDomino = new Domino(5, 3);
        Assertions.assertTrue(domino.compareTo(largerDomino) < 0);
    }

    // Additional tests can be added for edge cases and further functionalities
}
