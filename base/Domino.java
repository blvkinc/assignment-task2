package base;

/**
 * The Domino class represents a domino with high and low values. It implements
 * Comparable to support sorting of dominoes.
 * 
 * Author: Kevan Buckley, maintained by __student Version: 2.0, 2014
 */

public class Domino implements Comparable<Domino> {
	private int high;
	private int low;
	private int hx;
	private int hy;
	private int lx;
	private int ly;
	private boolean placed = false;

	/**
	 * Constructs a Domino object with specified high and low values.
	 * 
	 * @param high The high value of the domino.
	 * @param low  The low value of the domino.
	 */
	public Domino(int high, int low) {
		super();
		this.setHigh(high);
		this.setLow(low);
	}

	/**
	 * Places the domino on the grid with specified coordinates.
	 * 
	 * @param hx The x-coordinate of the higher end.
	 * @param hy The y-coordinate of the higher end.
	 * @param lx The x-coordinate of the lower end.
	 * @param ly The y-coordinate of the lower end.
	 */
	public void place(int hx, int hy, int lx, int ly) {
		this.setHx(hx);
		this.setHy(hy);
		this.setLx(lx);
		this.setLy(ly);
		setPlaced(true);
	}

	/**
	 * Converts the domino to a string representation.
	 * 
	 * @return The string representation of the domino.
	 */
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("[");
		result.append(Integer.toString(getHigh()));
		result.append(Integer.toString(getLow()));
		result.append("]");
		if (!isPlaced()) {
			appendUnplacedInfo(result);
		} else {
			appendPlacedInfo(result);
		}
		return result.toString();
	}

	private void appendUnplacedInfo(StringBuffer result) {
		result.append("unplaced");
	}

	private void appendPlacedInfo(StringBuffer result) {
		result.append("(");
		result.append(Integer.toString(getHx() + 1));
		result.append(",");
		result.append(Integer.toString(getHy() + 1));
		result.append(")");
		result.append("(");
		result.append(Integer.toString(getLx() + 1));
		result.append(",");
		result.append(Integer.toString(getLy() + 1));
		result.append(")");
	}

	/**
	 * Inverts the domino by turning it around 180 degrees clockwise.
	 */
	public void invert() {
		int tx = getHx();
		setHx(getLx());
		setLx(tx);

		int ty = getHy();
		setHy(getLy());
		setLy(ty);
	}

	/**
	 * Checks if the domino is horizontal.
	 * 
	 * @return true if the domino is horizontal, false otherwise.
	 */
	public boolean ishl() {
		return getHy() == getLy();
	}

	public int compareTo(Domino arg0) {
		if (this.getHigh() < arg0.getHigh()) {
			return 1;
		}
		return this.getLow() - arg0.getLow();
	}

	// Getters and setters for high, low, hx, hy, lx, ly, and placed
	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHx() {
		return hx;
	}

	public void setHx(int hx) {
		this.hx = hx;
	}

	public int getHy() {
		return hy;
	}

	public void setHy(int hy) {
		this.hy = hy;
	}

	public int getLx() {
		return lx;
	}

	public void setLx(int lx) {
		this.lx = lx;
	}

	public int getLy() {
		return ly;
	}

	public void setLy(int ly) {
		this.ly = ly;
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

}