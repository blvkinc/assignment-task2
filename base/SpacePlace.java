package base;

/**
 * The SpacePlace class represents a point in space with both Cartesian and
 * polar coordinates. It includes methods to get and set Cartesian coordinates
 * and polar coordinates.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class SpacePlace {
	// Cartesian coordinates
	private int xOrg;
	private int yOrg;

	// Polar coordinates
	private PolarCoordinates polarCoordinates;

	/**
	 * Default constructor initializes Cartesian coordinates to (0, 0) and polar
	 * coordinates to (0.0, 0.0).
	 */
	public SpacePlace() {
		xOrg = 0;
		yOrg = 0;
		polarCoordinates = new PolarCoordinates(0.0, 0.0);
	}

	/**
	 * Constructor with polar coordinates parameter. Initializes Cartesian
	 * coordinates to (0, 0) and sets the provided polar coordinates.
	 * 
	 * @param polarCoordinates The polar coordinates to set.
	 */
	public SpacePlace(PolarCoordinates polarCoordinates) {
		this.xOrg = 0;
		this.yOrg = 0;
		this.polarCoordinates = polarCoordinates;
	}

	/**
	 * Get the x-coordinate in Cartesian coordinates.
	 * 
	 * @return The x-coordinate.
	 */
	public int getxOrg() {
		return xOrg;
	}

	/**
	 * Set the x-coordinate in Cartesian coordinates.
	 * 
	 * @param xOrg The x-coordinate to set.
	 */
	public void setxOrg(int xOrg) {
		this.xOrg = xOrg;
	}

	/**
	 * Get the y-coordinate in Cartesian coordinates.
	 * 
	 * @return The y-coordinate.
	 */
	public int getyOrg() {
		return yOrg;
	}

	/**
	 * Set the y-coordinate in Cartesian coordinates.
	 * 
	 * @param yOrg The y-coordinate to set.
	 */
	public void setyOrg(int yOrg) {
		this.yOrg = yOrg;
	}

	/**
	 * Get the polar coordinates.
	 * 
	 * @return The polar coordinates.
	 */
	public PolarCoordinates getPolarCoordinates() {
		return polarCoordinates;
	}

	/**
	 * Set the polar coordinates.
	 * 
	 * @param polarCoordinates The polar coordinates to set.
	 */
	public void setPolarCoordinates(PolarCoordinates polarCoordinates) {
		this.polarCoordinates = polarCoordinates;
	}
}