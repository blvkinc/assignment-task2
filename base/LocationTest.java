package base;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Color;
import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class LocationTest {

    @Test
    public void testToStringWithoutDirection() {
        Location location = new Location(2, 3);
        String expected = "(4,3)";
        String actual = location.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringWithDirection() {
        Location location = new Location(2, 3, Location.DIRECTION.HORIZONTAL);
        String expected = "(4,3,HORIZONTAL)";
        String actual = location.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetInt() {
        // Mocking the System.in for providing input
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int expected = 5;
        int actual = Location.getInt();
        assertEquals(expected, actual);
    }

    @Test
    public void testDrawGridLinesVertical() {
        // Mocking the Graphics object for testing purposes
        GraphicsMock graphicsMock = new GraphicsMock();
        Location location = new Location(0, 0);
        location.setDireactionInitial(Location.DIRECTION.VERTICAL);
        location.drawGridLines(graphicsMock);

        // Verify that vertical lines were drawn
        assertTrue(graphicsMock.verticalLinesDrawn() > 0);
    }

    @Test
    public void testDrawGridLinesHorizontal() {
        // Mocking the Graphics object for testing purposes
        GraphicsMock graphicsMock = new GraphicsMock();
        Location location = new Location(0, 0);
        location.setDireactionInitial(Location.DIRECTION.HORIZONTAL);
        location.drawGridLines(graphicsMock);

        // Verify that horizontal lines were drawn
        assertTrue(graphicsMock.horizontalLinesDrawn() > 0);
    }

    // Mock class to count the number of lines drawn by Graphics object
    private static class GraphicsMock extends Graphics {
        private int verticalLines = 0;
        private int horizontalLines = 0;

        @Override
        public void drawLine(int x1, int y1, int x2, int y2) {
            if (x1 == x2) {
                verticalLines++;
            } else if (y1 == y2) {
                horizontalLines++;
            }
        }

        @Override
        public void setColor(Color c) {
            // Implementing the setColor method for mocking purposes
        }

        @Override
        public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
            // Empty implementation
        }

        @Override
        public void fillRect(int x, int y, int width, int height) {
            // Empty implementation
        }

        @Override
        public Graphics create() {
            return null; // Empty implementation
        }

        // Implement other methods with empty bodies as needed for testing purposes

        public int verticalLinesDrawn() {
            return verticalLines;
        }

        public int horizontalLinesDrawn() {
            return horizontalLines;
        }
        // Other required abstract methods can be implemented if necessary for test purposes
    }
}
