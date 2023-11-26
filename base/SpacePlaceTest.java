package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpacePlaceTest {

	@Test
	public void testDefaultConstructor() {
		SpacePlace spacePlace = new SpacePlace();

		assertEquals(0, spacePlace.getxOrg());
		assertEquals(0, spacePlace.getyOrg());
		assertEquals(0.0, spacePlace.getPolarCoordinates().getRadius(), 0.0);
		assertEquals(0.0, spacePlace.getPolarCoordinates().getTheta(), 0.0);
	}

	@Test
	public void testConstructorWithPolarCoordinates() {
		PolarCoordinates polarCoordinates = new PolarCoordinates(5.0, Math.PI / 4);
		SpacePlace spacePlace = new SpacePlace(polarCoordinates);

		assertEquals(0, spacePlace.getxOrg());
		assertEquals(0, spacePlace.getyOrg());
		assertEquals(5.0, spacePlace.getPolarCoordinates().getRadius(), 0.0);
		assertEquals(Math.PI / 4, spacePlace.getPolarCoordinates().getTheta(), 0.0);
	}

	@Test
	public void testGetAndSetxOrg() {
		SpacePlace spacePlace = new SpacePlace();

		spacePlace.setxOrg(10);

		assertEquals(10, spacePlace.getxOrg());
	}

	@Test
	public void testGetAndSetyOrg() {
		SpacePlace spacePlace = new SpacePlace();

		spacePlace.setyOrg(20);

		assertEquals(20, spacePlace.getyOrg());
	}

	@Test
	public void testGetAndSetPolarCoordinates() {
		SpacePlace spacePlace = new SpacePlace();
		PolarCoordinates polarCoordinates = new PolarCoordinates(8.0, Math.PI / 3);

		spacePlace.setPolarCoordinates(polarCoordinates);

		assertEquals(8.0, spacePlace.getPolarCoordinates().getRadius(), 0.0);
		assertEquals(Math.PI / 3, spacePlace.getPolarCoordinates().getTheta(), 0.0);
	}
}