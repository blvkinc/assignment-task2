package base;

/**
 * Represents polar coordinates with theta and phi angles.
 */
class PolarCoordinates {
	private double theta;
	private double phi;

	public PolarCoordinates(double theta, double phi) {
		this.theta = theta;
		this.phi = phi;
	}

	public double getTheta() {
		return theta;
	}

	public double getPhi() {
		return phi;
	}
}