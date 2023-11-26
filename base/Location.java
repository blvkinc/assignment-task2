package base;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Location class represents a position in a grid and provides methods for
 * drawing grid lines. It extends the SpacePlace class.
 *
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class Location extends SpacePlace {
	private int columnInitial; // Initial column position
	private int rowInitial; // Initial row position
	private DIRECTION direactionInitial; // Initial direction
	private int tmporyInitial; // Initial temporary value

	/**
	 * Enumeration representing possible directions: VERTICAL and HORIZONTAL.
	 */
	public enum DIRECTION {
		VERTICAL, HORIZONTAL
	};

	// Getter and setter methods for columnInitial
	public int getColumnInitial() {
		return columnInitial;
	}

	public void setColumnInitial(int columnInitial) {
		this.columnInitial = columnInitial;
	}

	// Getter and setter methods for rowInitial
	public int getRowInitial() {
		return rowInitial;
	}

	public void setRowInitial(int rowInitial) {
		this.rowInitial = rowInitial;
	}

	// Getter and setter methods for direactionInitial
	public DIRECTION getDireactionInitial() {
		return direactionInitial;
	}

	public void setDireactionInitial(DIRECTION direactionInitial) {
		this.direactionInitial = direactionInitial;
	}

	// Getter and setter methods for tmporyInitial
	public int getTmporyInitial() {
		return tmporyInitial;
	}

	public int setTmporyInitial(int tmporyInitial) {
		this.tmporyInitial = tmporyInitial;
		return tmporyInitial;
	}

	/**
	 * Constructor for initializing Location with row and column.
	 *
	 * @param r Row position
	 * @param c Column position
	 */
	public Location(int r, int c) {
		this.setRowInitial(r);
		this.setColumnInitial(c);
	}

	/**
	 * Constructor for initializing Location with row, column, and direction.
	 *
	 * @param r Row position
	 * @param c Column position
	 * @param d Initial direction
	 */
	public Location(int r, int c, DIRECTION d) {
		this(r, c);
		this.setDireactionInitial(d);
	}

	/**
	 * Generates a string representation of the Location.
	 *
	 * @return String representation of the Location.
	 */
	public String toString() {
		if (getDireactionInitial() == null) {
			setTmporyInitial(getColumnInitial() + 1);
			return "(" + (getTmporyInitial()) + "," + (getRowInitial() + 1) + ")";
		} else {
			setTmporyInitial(getColumnInitial() + 1);
			return "(" + (getTmporyInitial()) + "," + (getRowInitial() + 1) + "," + getDireactionInitial() + ")";
		}
	}

	/**
	 * Draws grid lines using the specified Graphics object.
	 *
	 * @param g Graphics object for drawing
	 */
	public void drawGridLines(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		for (setTmporyInitial(0); getTmporyInitial() <= 7; tmporyInitial++) {
			g.drawLine(20, 20 + getTmporyInitial() * 20, 180, 20 + getTmporyInitial() * 20);
		}
		for (int see = 0; see <= 8; see++) {
			g.drawLine(20 + see * 20, 20, 20 + see * 20, 160);
		}
	}

	/**
	 * Reads an integer from the console input using BufferedReader.
	 *
	 * @return Integer read from the console
	 */
	public static int getInt() {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				return Integer.parseInt(r.readLine());
			} catch (Exception e) {
				// Error handling for invalid input
			}
		} while (true);
	}
}