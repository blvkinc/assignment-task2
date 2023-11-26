package base;

/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class SpacePlace {
	private int xOrg;
	private int yOrg;
	private double theta;
	private double phi;

	public SpacePlace() {
        this(0, 0, 0.0, 0.0);
    }


	public SpacePlace(int xOrg, int yOrg, double theta, double phi) {
        this.xOrg = xOrg;
        this.yOrg = yOrg;
        this.theta = theta;
        this.phi = phi;
    }

	public int getxOrg() {
		return xOrg;
	}

	public void setxOrg(int xOrg) {
		this.xOrg = xOrg;
	}

	public int getyOrg() {
		return yOrg;
	}

	public void setyOrg(int yOrg) {
		this.yOrg = yOrg;
	}

	public double getTheta() {
		return theta;
	}

	public void setTheta(double theta) {
		this.theta = theta;
	}

	public double getPhi() {
		return phi;
	}

	public void setPhi(double phi) {
		this.phi = phi;
	}

}
