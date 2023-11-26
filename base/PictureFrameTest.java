package base;

import static org.junit.Assert.assertNotNull;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import org.junit.Before;
import org.junit.Test;

public class PictureFrameTest {

	private PictureFrame pictureFrame;

	@Before
	public void setUp() {
		pictureFrame = new PictureFrame();
		pictureFrame.PictureFrameAction(new Main());
	}

	@Test
	public void testPictureFrameInitialization() {
		assertNotNull(pictureFrame.master);
		assertNotNull(pictureFrame.dp);
	}

	@Test
	public void testDrawGrid() {
		BufferedImage image = new BufferedImage(202, 182, BufferedImage.TYPE_INT_ARGB);
		Graphics g = image.getGraphics();
		pictureFrame.dp.drawGrid(g);

		// You can add assertions based on the expected result of drawGrid
		// For example, checking if certain pixels have the expected color.

		// For simplicity, let's just check if the drawing process completes without
		// errors.
	}

	@Test
	public void testDrawHeadings() {
		BufferedImage image = new BufferedImage(202, 182, BufferedImage.TYPE_INT_ARGB);
		Graphics g = image.getGraphics();
		pictureFrame.dp.drawHeadings(g);

		// Similar to testDrawGrid, you can add assertions for expected results.
	}

	

	// Add more test methods as needed for other functionalities in PictureFrame
}