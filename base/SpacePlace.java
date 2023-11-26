package base;

/**
 * Represents a location in space.
 * Manages the coordinates and angles of a point in space.
 * 
 * Coordinates are represented by xCoordinate and yCoordinate.
 * Angles are represented by theta and phi.
 * 
 * Provides methods to access and modify the coordinates and angles of a point in space.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class SpacePlace {
    private int xCoordinate; // Represents the x-coordinate of the point
    private int yCoordinate; // Represents the y-coordinate of the point
    private double theta; // Represents the angle theta
    private double phi; // Represents the angle phi

    /**
     * Default constructor initializing the coordinates to (0, 0).
     */
    public SpacePlace() {
        xCoordinate = 0;
        yCoordinate = 0;
    }

    /**
     * Constructor initializing the angles theta and phi.
     * 
     * @param theta The angle theta
     * @param phi   The angle phi
     */
    public SpacePlace(double theta, double phi) {
        this(); // Calls the default constructor to set coordinates to (0, 0)
        this.theta = theta;
        this.phi = phi;
    }

    /**
     * Retrieves the x-coordinate of the point.
     * 
     * @return The x-coordinate
     */
    public int getXCoordinate() {
        return xCoordinate;
    }

    /**
     * Sets the x-coordinate of the point.
     * 
     * @param xCoordinate The x-coordinate to set
     */
    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    /**
     * Retrieves the y-coordinate of the point.
     * 
     * @return The y-coordinate
     */
    public int getYCoordinate() {
        return yCoordinate;
    }

    /**
     * Sets the y-coordinate of the point.
     * 
     * @param yCoordinate The y-coordinate to set
     */
    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    /**
     * Retrieves the angle theta.
     * 
     * @return The angle theta
     */
    public double getTheta() {
        return theta;
    }

    /**
     * Sets the angle theta.
     * 
     * @param theta The angle theta to set
     */
    public void setTheta(double theta) {
        this.theta = theta;
    }

    /**
     * Retrieves the angle phi.
     * 
     * @return The angle phi
     */
    public double getPhi() {
        return phi;
    }

    /**
     * Sets the angle phi.
     * 
     * @param phi The angle phi to set
     */
    public void setPhi(double phi) {
        this.phi = phi;
    }
}
